<%-- Created by IntelliJ IDEA. User: ToanNC7 Date: 12/21/2020 Time: 16:31 To
change this template use File | Settings | File Templates. --%>

  <div class="postoverlay"></div>

  <div class="responsive-header">
    <div class="mh-head first Sticky">
      <span class="mh-btns-left">
        <a class="" href="#menu"><i class="fa fa-align-justify"></i></a>
      </span>
      <span class="mh-text">
        <a href="newsfeed.html" title=""
          ><img src="images/logo2.png" alt=""
        /></a>
      </span>
      <span class="mh-btns-right">
        <a class="fa fa-sliders" href="#shoppingbag"></a>
      </span>
    </div>
    <div class="mh-head second">
      <form class="mh-form">
        <input placeholder="search" />
        <a href="#/" class="fa fa-search"></a>
      </form>
    </div>
  </div>
  <!-- responsive header -->

  <div class="topbar stick">
    <div class="logo">
      <a title="" href="newsfeed.html"><img src="images/logo.png" alt="" /></a>
    </div>
    <div class="top-area">
      <div class="top-search">
        <form method="post" class="">
          <input type="text" placeholder="Search People, Pages, Groups etc" />
          <button data-ripple><i class="ti-search"></i></button>
        </form>
      </div>
      <div class="page-name">
        <span>Newsfeed</span>
      </div>
      <ul class="setting-area">
        <li>
          <a href="newsfeed.html" title="Home" data-ripple=""
            ><i class="fa fa-home"></i
          ></a>
        </li>
        <li>
          <a href="#" title="Friend Requests" data-ripple="">
            <i class="fa fa-user"></i><em class="bg-red">5</em>
          </a>
          <div class="dropdowns">
            <span>5 New Requests <a href="#" title="">View all Requests</a></span>
            <ul class="drops-menu">
              <li>
                <div>
                  <figure>
                    <img src="images/resources/thumb-2.jpg" alt="" />
                  </figure>
                  <div class="mesg-meta">
                    <h6><a href="#" title="">Loren</a></h6>
                    <span><b>Amy</b> is mutule friend</span>
                    <i>yesterday</i>
                  </div>
                  <div class="add-del-friends">
                    <a href="#" title=""><i class="fa fa-heart"></i></a>
                    <a href="#" title=""><i class="fa fa-trash"></i></a>
                  </div>
                </div>
              </li>
            </ul>
            <a href="friend-requests.html" title="" class="more-mesg"
              >View All</a
            >
          </div>
        </li>
        <li>
          <a href="#" title="Notification" data-ripple="">
            <i class="fa fa-bell"></i><em class="bg-purple">7</em>
          </a>
          <div class="dropdowns">
            <span
              >4 New Notifications
              <a href="#" title="">Mark all as read</a></span
            >
            <ul class="drops-menu">
              <li>
                <a href="notifications.html" title="">
                  <figure>
                    <img src="${pageContext.request.contextPath}/template/client/images/resources/thumb-1.jpg" alt="" />
                    <span class="status f-online"></span>
                  </figure>
                  <div class="mesg-meta">
                    <h6>sarah Loren</h6>
                    <span>commented on your new profile status</span>
                    <i>2 min ago</i>
                  </div>
                </a>
              </li>
            </ul>
            <a href="notifications.html" title="" class="more-mesg">View All</a>
          </div>
        </li>
        <li>
          <a href="#" title="Messages" data-ripple=""
            ><i class="fa fa-commenting"></i><em class="bg-blue">9</em></a
          >
          <div class="dropdowns">
            <span
              >5 New Messages <a href="#" title="">Mark all as read</a></span
            >
            <ul class="drops-menu">
              <li>
                <a class="show-mesg" href="#" title="">
                  <figure>
                    <img src="${pageContext.request.contextPath}/template/client/images/resources/thumb-1.jpg" alt="" />
                    <span class="status f-online"></span>
                  </figure>
                  <div class="mesg-meta">
                    <h6>sarah Loren</h6>
                    <span><i class="ti-check"></i> Hi, how r u dear ...?</span>
                    <i>2 min ago</i>
                  </div>
                </a>
              </li>
            </ul>
            <a href="chat-messenger.html" title="" class="more-mesg"
              >View All</a
            >
          </div>
        </li>
        <li>
          <a href="#" title="Languages" data-ripple="">
            <i class="fa fa-globe"></i><em>EN</em></a
          >
          <div class="dropdowns languages">
            <%@include file="themelayout/languages.jsp" %>
          </div>
        </li>
        <li>
          <a href="#" title="Help" data-ripple=""
            ><i class="fa fa-question-circle"></i
          ></a>
          <div class="dropdowns helps">
            <span>Help with this page</span>
            <ul class="help-drop">
              <li>
                <a href="forum.html" title=""
                  ><i class="fa fa-book"></i>Community & Forum</a
                >
              </li>
              <li>
                <a href="faq.html" title=""
                  ><i class="fa fa-question-circle-o"></i>FAQs</a
                >
              </li>
              <li>
                <a href="career.html" title=""
                  ><i class="fa fa-building-o"></i>Carrers</a
                >
              </li>
              <li>
                <a href="privacy.html" title=""
                  ><i class="fa fa-pencil-square-o"></i>Terms & Policy</a
                >
              </li>
              <li>
                <a href="#" title=""><i class="fa fa-map-marker"></i>Contact</a>
              </li>
              <li>
                <a href="#" title=""
                  ><i class="fa fa-exclamation-triangle"></i>Report a Problem</a
                >
              </li>
            </ul>
          </div>
        </li>
      </ul>
      <div class="user-img">
        <h5>Jack Carter</h5>
        <img src="${pageContext.request.contextPath}/template/client/images/resources/admin.jpg" alt="" />
        <span class="status f-online"></span>
        <div class="user-setting">
          <span class="seting-title">Chat setting <a href="#" title="">see all</a></span>
          <ul class="chat-setting">
            <li>
              <a href="#" title=""
                ><span class="status f-online"></span>online</a>
            </li>
            <li>
              <a href="#" title=""><span class="status f-away"></span>away</a>
            </li>
            <li>
              <a href="#" title=""><span class="status f-off"></span>offline</a>
            </li>
          </ul>
          <span class="seting-title">User setting <a href="#" title="">see all</a></span>
          <ul class="log-out">
            <li>
              <a href="about.html" title=""><i class="ti-user"></i> view profile</a>
            </li>
            <li>
              <a href="setting.html" title=""><i class="ti-pencil-alt"></i>edit profile</a>
            </li>
            <li>
              <a href="#" title=""><i class="ti-target"></i>activity log</a>
            </li>
            <li>
              <a href="setting.html" title=""><i class="ti-settings"></i>account setting</a>
            </li>
            <li>
              <a href="logout.html" title=""><i class="ti-power-off"></i>log out</a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
  <!-- topbar -->

  <div class="fixed-sidebar right">
    <%@include file="themelayout/chat-friendz.jsp" %>
  </div>
  <!-- right sidebar user chat -->
