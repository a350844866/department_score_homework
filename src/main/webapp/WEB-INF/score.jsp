<%@ page language="java" pageEncoding="UTF-8" %>
<%@ include file="base.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">
<style>
    form {
        width: 900px;
        margin: 40px auto;
        background: lightskyblue;
    }

    body {
        background: url("../staticfile/images/formbg.jpeg");
        background-size: cover;
        text-align: center;
    }

    button {
        text-align: center;
        width: auto;
        height: auto;
        font-size: 50px;
        background-color: lightskyblue;
    }
</style>
<head>


</head>

<body class="">

<form>
    <table border="1>">
        <tr>
            <th width="200px" align="center"></th>
            <c:forEach items="${allQuestion}" var="q" varStatus="status">

                <th width="200px" align="center">${q.questionName}</th>
            </c:forEach>
        </tr>
        <c:forEach items="${allDepartment}" var="d" varStatus="status">
            <tr>
                <td width="200px" align="center">${d.departmentName}</td>
                <c:forEach items="${allQuestion}" var="q" varStatus="status">
                    <td width="200px" align="center">
                        <select name="${d.id}-${q.id}">
                            <option value="1"
                                    <c:forEach items="${dataList}" var="data" varStatus="status">
                                        <c:set var="dataDId" scope="request" value="${data.departmentId}"></c:set>
                                        <c:set var="dataQId" scope="request" value="${data.questionId}"></c:set>
                                        <c:if test="${d.id==dataDId}">
                                            <c:if test="${q.id==dataQId}">
                                                <c:if test="${data.score==1}">
                                                    selected="selected"
                                                </c:if>
                                            </c:if>
                                        </c:if>
                                    </c:forEach>
                            >1
                            </option>
                            <option value="2"
                                    <c:forEach items="${dataList}" var="data" varStatus="status">
                                        <c:set var="dataDId" scope="request" value="${data.departmentId}"></c:set>
                                        <c:set var="dataQId" scope="request" value="${data.questionId}"></c:set>
                                        <c:if test="${d.id==dataDId}">
                                            <c:if test="${q.id==dataQId}">
                                                <c:if test="${data.score==2}">
                                                    selected="selected"
                                                </c:if>
                                            </c:if>
                                        </c:if>
                                    </c:forEach>>
                                2
                            </option>
                            <option value="3"
                                    <c:forEach items="${dataList}" var="data" varStatus="status">
                                        <c:set var="dataDId" scope="request" value="${data.departmentId}"></c:set>
                                        <c:set var="dataQId" scope="request" value="${data.questionId}"></c:set>
                                        <c:if test="${d.id==dataDId}">
                                            <c:if test="${q.id==dataQId}">
                                                <c:if test="${data.score==3}">
                                                    selected="selected"
                                                </c:if>
                                            </c:if>
                                        </c:if>
                                    </c:forEach>>
                                3
                            </option>
                            <option value="4"
                                    <c:forEach items="${dataList}" var="data" varStatus="status">
                                        <c:set var="dataDId" scope="request" value="${data.departmentId}"></c:set>
                                        <c:set var="dataQId" scope="request" value="${data.questionId}"></c:set>
                                        <c:if test="${d.id==dataDId}">
                                            <c:if test="${q.id==dataQId}">
                                                <c:if test="${data.score==4}">
                                                    selected="selected"
                                                </c:if>
                                            </c:if>
                                        </c:if>
                                    </c:forEach>>
                                4
                            </option>
                            <option value="5"
                                    <c:forEach items="${dataList}" var="data" varStatus="status">
                                        <c:set var="dataDId" scope="request" value="${data.departmentId}"></c:set>
                                        <c:set var="dataQId" scope="request" value="${data.questionId}"></c:set>
                                        <c:if test="${d.id==dataDId}">
                                            <c:if test="${q.id==dataQId}">
                                                <c:if test="${data.score==5}">
                                                    selected="selected"
                                                </c:if>
                                            </c:if>
                                        </c:if>
                                    </c:forEach>>
                                5
                            </option>
                            <option value="6"
                                    <c:forEach items="${dataList}" var="data" varStatus="status">
                                        <c:set var="dataDId" scope="request" value="${data.departmentId}"></c:set>
                                        <c:set var="dataQId" scope="request" value="${data.questionId}"></c:set>
                                        <c:if test="${d.id==dataDId}">
                                            <c:if test="${q.id==dataQId}">
                                                <c:if test="${data.score==6}">
                                                    selected="selected"
                                                </c:if>
                                            </c:if>
                                        </c:if>
                                    </c:forEach>>
                                6
                            </option>
                            <option value="7"
                                    <c:forEach items="${dataList}" var="data" varStatus="status">
                                        <c:set var="dataDId" scope="request" value="${data.departmentId}"></c:set>
                                        <c:set var="dataQId" scope="request" value="${data.questionId}"></c:set>
                                        <c:if test="${d.id==dataDId}">
                                            <c:if test="${q.id==dataQId}">
                                                <c:if test="${data.score==7}">
                                                    selected="selected"
                                                </c:if>
                                            </c:if>
                                        </c:if>
                                    </c:forEach>>
                                7
                            </option>
                            <option value="8"  <c:forEach items="${dataList}" var="data" varStatus="status">
                                <c:set var="dataDId" scope="request" value="${data.departmentId}"></c:set>
                                <c:set var="dataQId" scope="request" value="${data.questionId}"></c:set>
                                <c:if test="${d.id==dataDId}">
                                    <c:if test="${q.id==dataQId}">
                                        <c:if test="${data.score==8}">
                                            selected="selected"
                                        </c:if>
                                    </c:if>
                                </c:if>
                            </c:forEach>>
                                8
                            </option>
                            <option value="9"
                                    <c:forEach items="${dataList}" var="data" varStatus="status">
                                        <c:set var="dataDId" scope="request" value="${data.departmentId}"></c:set>
                                        <c:set var="dataQId" scope="request" value="${data.questionId}"></c:set>
                                        <c:if test="${d.id==dataDId}">
                                            <c:if test="${q.id==dataQId}">
                                                <c:if test="${data.score==9}">
                                                    selected="selected"
                                                </c:if>
                                            </c:if>
                                        </c:if>
                                    </c:forEach>>
                                9
                            </option>
                            <option value="10"
                                    <c:forEach items="${dataList}" var="data" varStatus="status">
                                        <c:set var="dataDId" scope="request" value="${data.departmentId}"></c:set>
                                        <c:set var="dataQId" scope="request" value="${data.questionId}"></c:set>
                                        <c:if test="${d.id==dataDId}">
                                            <c:if test="${q.id==dataQId}">
                                                <c:if test="${data.score==10}">
                                                    selected="selected"
                                                </c:if>
                                            </c:if>
                                        </c:if>
                                    </c:forEach>>
                                10
                            </option>
                        </select>
                    </td>
                </c:forEach>
            </tr>
        </c:forEach>
    </table>
</form>
<button onclick="formSubmitPost('score','_self');this.blur();" style="text-align: center;
   width: auto;
   height: auto;
   font-size:50px;" >提交分數</button>
</body>
</html>


