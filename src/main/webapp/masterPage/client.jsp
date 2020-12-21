<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title><dec:title/></title>
    <meta charset=UTF-8"/>
    <link rel="icon" href="${pageContext.request.contextPath}/template/client/images/fav.png" type="image/png"
          sizes="16x16">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/template/client/css/main.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/template/client/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/template/client/css/color.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/template/client/css/responsive.css">
</head>
<body>
<div class="wavy-wraper">
    <div class="wavy">
        <span style="--i: 1">N</span>
        <span style="--i: 2">A</span>
        <span style="--i: 3">O</span>
        <span style="--i: 4">T</span>
        <span style="--i: 5">9</span>
        <span style="--i: 6">7</span>
        <span style="--i: 7">.</span>
        <span style="--i: 8">.</span>
        <span style="--i: 9">.</span>
    </div>
</div>
<div class="theme-layout">
    <%@ include file="/common/client/theme-layout.jsp" %>
    <dec:body/>
    <%@ include file="/common/client/footer.jsp" %>
</div>
<%@ include file="/common/client/side-panel.jsp" %>
<%@ include file="/common/client/popup-wraper2.jsp" %>
<%@ include file="/common/client/popup-wraper3.jsp" %>
<%@ include file="/common/client/popup-wraper1.jsp" %>
<%@ include file="/common/client/modal-fade.jsp" %>


</body>
</html>