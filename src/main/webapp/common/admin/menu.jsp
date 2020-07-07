<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/url.jsp" %>
<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
		<ul class="nav" id="side-menu">
			<li class="sidebar-search">
				<div class="input-group custom-search-form">
					<input type="text" class="form-control" placeholder="Nhập nội dung...">
					<span class="input-group-btn">
						<button class="btn btn-primary" type="button" id="d">
							<i class="fa fa-search"></i>
						</button>
					</span>
				</div> <!-- /input-group -->
			</li>
			<li><a href="${pageContext.request.contextPath}/quan-tri/home" class="active"><i
					class="fa fa-home fa-fw"></i>Trang Chủ</a></li>
			<li><a href="#"><i class="fa fa-table fa-fw"></i>Quản Lý<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="${pageContext.request.contextPath}/quan-tri/category">Thể loại</a></li>
					<li><a href="${pageContext.request.contextPath}/quan-tri/bai-viet">Bài viết</a></li>
					<li><a href="${pageContext.request.contextPath}/quan-tri/tag">Tag</a></li>
					<li><a href="${pageContext.request.contextPath}/quan-tri/comment">Comment</a></li>
				</ul>
			</li>
			<li>
				<a href="#">
					<i class="fa fa-file fa-fw"></i>Thống Kê
					<span class="fa arrow"></span>
				</a>
				<ul class="nav nav-second-level">
					<li><a href="${pageContext.request.contextPath}/quan-tri/#"></a></li>
				</ul>
			</li>
			<li>
				<a href="#" class="active"><i class="fa fa-fw"></i>Người
					dùng</a>
			</li>
			<li>
				<a href="${pageContext.request.contextPath}/quan-tri/tai-khoan"><i class="fa fa-users fa-fw"></i>Quản lý người
					dùng</a>
			</li>
			<li>
				<a href="${pageContext.request.contextPath}/quan-tri/tai-khoan/vai-tro"><i class="fa fa-bolt fa-fw"></i>Quyền
					người dùng</a>
			</li>
			<li>
				<a href="${pageContext.request.contextPath}/quan-tri/phan-hoi"><i
					class="fa fa-support fa-fw"></i>Phản Hồi</a>
			</li>
			<li>
				<a class="active"><i class="fa fa-fw"></i>Trợ
					giúp</a>
			</li>
			<li>
				<a href="${pageContext.request.contextPath}/quan-tri/tai-lieu"><i
					class="fa fa-download fa-fw"></i>Dowload Tài liệu</a>
			</li>
			<li>
				<a  class="active"><i class="fa fa-fw">
				</i>By:	︵✰ʑDɱøηкїɗʑ®</a>
			</li>
		</ul>
	</div>
</div>