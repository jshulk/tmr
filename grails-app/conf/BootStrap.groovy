import org.example.Rig
class BootStrap {

    def init = { servletContext ->
		if(!Rig.count()){
			Rig rig1 = new Rig(desc:'noobs workspace', image:'https://s3.amazonaws.com/ThatsMyRig/uploads/rig/image/5/thumb_Screen_Shot_2013-06-26_at_11.59.21_PM.png', count:0, name:'My Wokspace').save(flush:true, failOnError:true)
			Rig rig2 = new Rig(desc:'noobs workspace', image:'https://s3.amazonaws.com/ThatsMyRig/uploads/rig/image/6/Screen_Shot_2013-06-27_at_12.02.27_AM.png', count:0, name:'My Wokspace').save(flush:true, failOnError:true)
			Rig rig3 = new Rig(desc:'noobs workspace', image:'https://s3.amazonaws.com/ThatsMyRig/uploads/rig/image/7/thumb_Screen_Shot_2013-06-27_at_12.07.31_AM.png', count:0, name:'My Wokspace').save(flush:true, failOnError:true)
			Rig rig4 = new Rig(desc:'noobs workspace', image:'https://s3.amazonaws.com/ThatsMyRig/uploads/rig/image/8/thumb_Screen_Shot_2013-06-27_at_12.09.15_AM.png', count:0, name:'My Wokspace').save(flush:true, failOnError:true)
			Rig rig5 = new Rig(desc:'noobs workspace', image:'https://s3.amazonaws.com/ThatsMyRig/uploads/rig/image/9/thumb_Apple_Mac_OS_X_Lion_Background.jpeg', count:0, name:'My Wokspace').save(flush:true, failOnError:true)
			
			Rig rig6 = new Rig(desc:'noobs workspace', image:'https://s3.amazonaws.com/ThatsMyRig/uploads/rig/image/5/thumb_Screen_Shot_2013-06-26_at_11.59.21_PM.png', count:0, name:'My Wokspace').save(flush:true, failOnError:true)
			Rig rig7 = new Rig(desc:'noobs workspace', image:'https://s3.amazonaws.com/ThatsMyRig/uploads/rig/image/6/Screen_Shot_2013-06-27_at_12.02.27_AM.png', count:0, name:'My Wokspace').save(flush:true, failOnError:true)
			Rig rig8 = new Rig(desc:'noobs workspace', image:'https://s3.amazonaws.com/ThatsMyRig/uploads/rig/image/7/thumb_Screen_Shot_2013-06-27_at_12.07.31_AM.png', count:0, name:'My Wokspace').save(flush:true, failOnError:true)
			Rig rig9 = new Rig(desc:'noobs workspace', image:'https://s3.amazonaws.com/ThatsMyRig/uploads/rig/image/8/thumb_Screen_Shot_2013-06-27_at_12.09.15_AM.png', count:0, name:'My Wokspace').save(flush:true, failOnError:true)
			Rig rig10 = new Rig(desc:'noobs workspace', image:'https://s3.amazonaws.com/ThatsMyRig/uploads/rig/image/9/thumb_Apple_Mac_OS_X_Lion_Background.jpeg', count:0, name:'My Wokspace').save(flush:true, failOnError:true)
			
		}
    }
    def destroy = {
    }
}
