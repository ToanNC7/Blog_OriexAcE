<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

    <title>Bog</title>
</head>
<body>
<section>
    <div class="gap2 gray-bg">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="row merged20" id="page-contents">
                        <div class="col-lg-3">
                            <aside class="sidebar static left">
                                <%@include file="/common/client/themelayout/widget.jsp" %>
                            </aside>
                        </div>
                        <!-- sidebar -->
                        <div class="col-lg-6">
                            <%@include file="/common/client/themelayout/central-meta.jsp" %>
                        </div>
                        <!-- centerl meta -->
                        <div class="col-lg-3">
                            <%@include file="/common/client/themelayout/sidebar-static-right.jsp" %>
                        </div>
                        <!-- sidebar -->
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

</body>
</html>