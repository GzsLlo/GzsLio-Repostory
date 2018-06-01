<!DOCTYPE html>
<html>

<head lang="en">
  <meta charset="UTF-8">
  <title>欢迎使用TRAIN-SERVER</title>

</head>

<body>
<header class="am-topbar am-topbar-fixed-top am-topbar-inverse">
  <div class="am-container">
    <h1 class="am-topbar-brand"><a href="#">ITANY SNS</a></h1>

    <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-secondary am-show-sm-only" data-am-collapse="{target: '#collapse-head'}"><span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span>
    </button>

    <div class="am-collapse am-topbar-collapse" id="collapse-head">
      <ul class="am-nav am-nav-pills am-topbar-nav">
        <li class="am-active"><a href="#">首页</a>
        </li>
        <li><a href="#">关于</a>
        </li>

      </ul>
      <div class="am-topbar-right" >
        <a href="javascript:doLogin();" class="am-btn am-btn-success am-topbar-btn am-btn-sm"><span class="am-icon-user"></span> 登录</a> <span style="color:red;margin-left: 30px;font-weight: bold;" id="tip">${message }</span>
      </div>

      <form id="login-form" class="am-topbar-form am-topbar-right am-form-inline" role="search" action="${pageContext.request.contextPath }/doLogin" method="post">
        <div class="am-form-group">
          <input type="text" id="email" name="email" class="am-form-field am-input-sm" placeholder="邮箱" value="${email }">
          <input type="password" id="password1" name="password" class="am-form-field am-input-sm" placeholder="密码" value="${password }">
        </div>
      </form>
    </div>
  </div>
</header>

<div class="get">
  <div class="am-g am-container">

    <div class="am-u-lg-7">
      <h2>联系你我，分享生活，尽在 ITANY SNS</h2>
      <img src="${pageContext.request.contextPath }/img/login_con.png" />

    </div>
    <div class="am-u-lg-5">

      <h1 style="margin-bottom: 5px;">注册</h1>
      <small>永久免费使用</small>
      <hr>

      <form method="post" class="am-form" data-am-validator>

        <div class="am-form-group ">
          <input type="text" class="am-form-field am-input-sm" id="rusername" name="username"
                 pattern="^\s*[\u4e00-\u9fa5]{1,}[\u4e00-\u9fa5.·]{0,15}[\u4e00-\u9fa5]{1,}\s*$"
                 required placeholder="真实姓名(2-15个汉字)">
        </div>

        <div class="am-form-group ">
          <input type="email" class="am-form-field am-input-sm"  pattern="^([a-zA-Z0-9]+)(@)([a-zA-Z0-9]+)([.]com)([.]cn)?$" required placeholder="常用邮箱" id="remail" name="email">
        </div>

        <div class="am-form-group ">
          <input type="password" class="am-form-field am-input-sm" pattern="^[0-9|a-z|A-Z]{6,16}$" required placeholder="密码(6-16位字母和数字)" id="pwd" name="password">
        </div>

        <div class="am-form-group ">
          <input type="password" class="am-form-field am-input-sm" placeholder="确认密码(与上栏相同)" required data-equal-to="#pwd" id="rrpwd" name="rpassword">
        </div>

        <button type="button" class="am-btn am-btn-secondary am-topbar-btn am-btn-sm" id="rregistBtn"><span class="am-icon-pencil"></span> 注册</button>

      </form>

    </div>
  </div>
</div>

<div class="detail">
  <div class="am-g am-container">
    <div class="am-u-lg-12">
      <h2 class="detail-h2">ITANY SNS,连起你和我!</h2>

      <div class="am-g">
        <div class="am-u-lg-3 am-u-md-6 am-u-sm-12 detail-mb">

          <h3 class="detail-h3">
            <i class="am-icon-user am-icon-sm"></i>
            新社交时代
          </h3>

          <p class="detail-p">
            找到你以前的同学,同事和好友;增加对好友的认识,结交新朋友;和他们随时联系,关注彼此的动态.
          </p>
        </div>
        <div class="am-u-lg-3 am-u-md-6 am-u-sm-12 detail-mb">
          <h3 class="detail-h3">
            <i class="am-icon-home am-icon-sm"></i>
            个人主页
          </h3>

          <p class="detail-p">
            创建个人主页,累计人气,与好友分享生活经历,让大家更好的认识你!
          </p>
        </div>
        <div class="am-u-lg-3 am-u-md-6 am-u-sm-12 detail-mb">
          <h3 class="detail-h3">
            <i class="am-icon-camera am-icon-sm"></i>
            相册
          </h3>

          <p class="detail-p">
            上传生活照片,整理成相册,记录精彩时刻,让你的照片发挥魅力!
          </p>
        </div>
        <div class="am-u-lg-3 am-u-md-6 am-u-sm-12 detail-mb">
          <h3 class="detail-h3">
            <i class="am-icon-weixin am-icon-sm"></i>
            小组
          </h3>

          <p class="detail-p">
            与志同道合的人组成小组,分享的你的经验,互相学习更多知识!
          </p>
        </div>
      </div>
    </div>
  </div>
</div>

<div class="hope">
  <div class="am-g am-container">
    <div class="am-u-lg-4 am-u-md-6 am-u-sm-12 hope-img">
      <img src="${pageContext.request.contextPath }/assets/i/examples/landing.png" alt="" data-am-scrollspy="{animation:'slide-left', repeat: true}">
      <hr class="am-article-divider am-show-sm-only hope-hr">
    </div>
    <div class="am-u-lg-8 am-u-md-6 am-u-sm-12">
      <h2 class="hope-title">中国领先的SNS网站! </h2>

      <p>
        南京网博信息技术有限公司始创于1996年，是中国领先的实名制的SNS网络平台。通过每个人真实的人际关系，满足各类用户对社交、资讯、娱乐等多方面的沟通需求。
      </p>
    </div>
  </div>
</div>

<div class="about">
  <div class="am-g am-container">
    <div class="am-u-lg-12">
      <h2 class="about-title about-color">ITANY 崇尚开放、自由，非常欢迎大家的参与</h2>

      <div class="am-g">
        <div class="am-u-lg-6 am-u-md-4 am-u-sm-12">
          <form class="am-form"  id="leaveword-form">
            <label for="name" class="about-color">你的姓名</label>
            <input id="name" name="name" type="text">
            <br/>
            <label for="email" class="about-color">你的邮箱</label>
            <input id="email1" name="email" type="email">
            <br/>
            <label for="message" class="about-color">你的留言</label>
            <textarea id="message" name="info"></textarea>
            <br/>
            <button type="button" id="submit1" class="am-btn am-btn-primary am-btn-sm"><i class="am-icon-check"></i> 提 交</button>
          </form>
          <hr class="am-article-divider am-show-sm-only">
        </div>

        <div class="am-u-lg-6 am-u-md-8 am-u-sm-12">
          <h4 class="about-color">关于我们</h4>

          <p>
            18年来，网博软件始终专注于为高速发展的长三角IT行业培养和输送高素质软件人才。网博软件是二十世纪九十年代国内首批Microsoft,Novell,SCO UNIX等国际知名厂商授权成立的高级技术培训中心。2006年，网博软件率先将国际和国内先进的软件人才实训理念引入江苏，同时，通过广泛与江苏省内的高等院校和IT企业合作，联合培养中高端软件人才，为江苏软件产业腾飞和南京市软件名城建设做出了贡献。2010年，网博软件成为首批江苏省政府认定的软件产业人才培训基地。2011年成为江苏省软件行业协会会员单位。2012年成为南京市服务外包人才培训基地、NSO理事单位、EIAEC培训基地。2014年成为南京国际服务外包企业协会副会长单位。
            多项合作”

          </p>

        </div>
      </div>
    </div>
  </div>
</div>
<footer class="footer">
  <p>© 2015 <a href="http://www.itany.com" target="_blank">www.itany.com</a> 南京网博计算机软件系统有限公司 版权所有 苏ICP备05021715号-1</p>
</footer>

<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="${pageContext.request.contextPath }/assets/js/polyfill/rem.min.js"></script>
<script src="${pageContext.request.contextPath }/assets/js/polyfill/respond.min.js"></script>
<script src="${pageContext.request.contextPath }/assets/js/amazeui.legacy.js"></script>
<![endif]-->

<!--[if (gte IE 9)|!(IE)]><!-->

<!--<![endif]-->
</body>

</html>