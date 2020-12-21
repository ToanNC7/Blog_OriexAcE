<%--
  Created by IntelliJ IDEA.
  User: ToanNC7
  Date: 12/21/2020
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<aside class="sidebar static right">
    <div class="widget">
        <h4 class="widget-title">Your page</h4>
        <div class="your-page">
            <figure>
                <a href="#" title=""><img
                        src="${pageContext.request.contextPath}/template/client/images/resources/friend-avatar9.jpg"
                        alt=""/></a>
            </figure>
            <div class="page-meta">
                <a href="#" title="" class="underline">My Creative Page</a>
                <span><i class="ti-comment"></i><a href="insight.html" title="">Messages <em>9</em></a></span>
                <span><i class="ti-bell"></i><a href="insight.html" title="">Notifications <em>2</em></a></span>
            </div>
            <ul class="page-publishes">
                <li>
                    <span><i class="ti-pencil-alt"></i>Publish</span>
                </li>
                <li>
                    <span><i class="ti-camera"></i>Photo</span>
                </li>
                <li>
                    <span><i class="ti-video-camera"></i>Live</span>
                </li>
                <li>
                    <span><i class="fa fa-user-plus"></i>Invite</span>
                </li>
            </ul>
            <div class="page-likes">
                <ul class="nav nav-tabs likes-btn">
                    <li class="nav-item">
                        <a   class="active"
                                href="#link1"
                                data-toggle="tab"
                                data-ripple="">likes</a>
                    </li>
                    <li class="nav-item">
                        <a class="" href="#link2"   data-toggle="tab"    data-ripple="">views</a>
                    </li>
                </ul>
                <!-- Tab panes -->
                <div class="tab-content">
                    <div class="tab-pane active fade show" id="link1">
                        <span><i class="ti-heart"></i>884</span>
                        <a href="#" title="weekly-likes">35 new likes this week</a>
                        <div class="users-thumb-list">
                            <a href="#" title="Anderw" data-toggle="tooltip">
                                <img src="${pageContext.request.contextPath}/template/client/images/resources/userlist-1.jpg" alt=""/>
                            </a>
                            <a href="#" title="Anderw" data-toggle="tooltip">
                                <img src="${pageContext.request.contextPath}/template/client/images/resources/userlist-1.jpg" alt=""/>
                            </a>
                            <a href="#" title="Anderw" data-toggle="tooltip">
                                <img src="${pageContext.request.contextPath}/template/client/images/resources/userlist-1.jpg" alt=""/>
                            </a>

                        </div>
                    </div>
                    <div class="tab-pane fade" id="link2">
                        <span><i class="fa fa-eye"></i>440</span>
                        <a href="#" title="weekly-likes">440 new views this week</a>
                        <div class="users-thumb-list">
                            <a href="#" title="Anderw" data-toggle="tooltip">
                                <img   src="${pageContext.request.contextPath}/template/client/images/resources/userlist-1.jpg" alt=""/>
                            </a>
                            <a href="#" title="Anderw" data-toggle="tooltip">
                                <img   src="${pageContext.request.contextPath}/template/client/images/resources/userlist-1.jpg" alt=""/>
                            </a>
                            <a href="#" title="Anderw" data-toggle="tooltip">
                                <img   src="${pageContext.request.contextPath}/template/client/images/resources/userlist-1.jpg" alt=""/>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- page like widget -->
    <div class="widget">
        <h4 class="widget-title">
            Explor Events
            <a title="" href="#" class="see-all">See All</a>
        </h4>
        <div class="rec-events bg-purple">
            <i class="ti-gift"></i>
            <h6>
                <a href="#" title="">Ocean Motel good night event in columbia</a>
            </h6>
            <img src="${pageContext.request.contextPath}/template/client/images/clock.png" alt=""/>
        </div>
        <div class="rec-events bg-blue">
            <i class="ti-microphone"></i>
            <h6>
                <a href="#" title="">2016 The 3rd International Conference</a>
            </h6>
            <img src="${pageContext.request.contextPath}/template/client/images/clock.png" alt=""/>
        </div>
    </div>
    <!-- explore events -->
</aside>
