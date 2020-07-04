package com.power.ssm.aop;

import com.power.ssm.common.Query;
import com.power.ssm.common.Result;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class QueryAspect {

    @Before("@annotation(com.power.ssm.aop.QueryAop)")
    public void doBefore(JoinPoint joinPoint) {
        for (Object param : joinPoint.getArgs()) {
            if (param instanceof Query) {
                try {
                    Query query = (Query) param;
                    query.setPageFlag(1);
                    if (query.getCurrentPage() == null || query.getCurrentPage() < 1) {
                        query.setCurrentPage(Query.CURRENT_PAGE);
                    }
                    if (query.getPageSize() == null || query.getPageSize() < 0) {
                        query.setPageSize(Query.PAGE_SIZE);
                    }
//                    if (query.getCreatedAtSort() == null) {
//                        query.setCreatedAtSort(Query.CREATED_SORT);
//                    } else if (!query.getCreatedAtSort().equals("desc") && !query.getCreatedAtSort().equals("asc")) {
//                        query.setCreatedAtSort(Query.CREATED_SORT);
//                    }
//                    if (query.getUpdatedAtSort() == null) {
//                        query.setUpdatedAtSort(Query.UPDATED_SORT);
//                    } else if (!query.getUpdatedAtSort().equals("desc") && !query.getUpdatedAtSort().equals("asc")) {
//                        query.setCreatedAtSort(Query.UPDATED_SORT);
//                    }
                    query.setStart((query.getCurrentPage() - 1) * query.getPageSize());
                } catch (Exception ignored) {
                }
            }
        }
    }

    @AfterReturning(returning="rvt", pointcut="@annotation(com.power.ssm.aop.QueryAop)")
    public void doAfter(JoinPoint joinPoint, Object rvt) {
        for (Object param : joinPoint.getArgs()) {
            if (param instanceof Query) {
                try {
                    Query query = (Query) param;
                    if (rvt instanceof Result) {
                        try {
                            Result result = (Result) rvt;
                            result.setPageSize(query.getPageSize());
                            result.setCurrentPage(query.getCurrentPage());
                            if (result.getTotal() % query.getPageSize() == 0) {
                                result.setPageCount(result.getTotal() / query.getPageSize());
                            } else {
                                result.setPageCount(result.getTotal() / query.getPageSize() + 1);
                            }
                        } catch (Exception ignored) {
                        }
                    }
                } catch (Exception ignore) {
                }
            }
        }
    }


}