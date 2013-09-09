import org.example.Rig
import org.example.Movie
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
		if(!Movie.count()){
			new Movie(rank:1, rating:9.2, title: 'The shawshank redemption', votes: 699295).save(failOnError:true, flush:true)
			new Movie(rank:2, rating:9.2, title: 'The Godfather', votes: 524507).save(failOnError:true, flush:true)
			new Movie(rank:3, rating:9.0, title: 'The Godfather: Part II (1974)', votes: 329051).save(failOnError:true, flush:true)
			new Movie(rank:4, rating:8.9, title: '	Il buono, il brutto, il cattivo. (1966)', votes: 219022).save(failOnError:true, flush:true)
			new Movie(rank:5, rating:8.9, title: 'Pulp Fiction (1994)', votes: 699295).save(failOnError:true, flush:true)
			new Movie(rank:6, rating:8.9, title: '12 Angry Men (1957)', votes: 699295).save(failOnError:true, flush:true)
			new Movie(rank:7, rating:8.9, title: "Schindler's List (1993)", votes: 699295).save(failOnError:true, flush:true)
			new Movie(rank:8, rating:8.8, title: "The Dark Knight (2008)", votes: 699295).save(failOnError:true, flush:true)
			new Movie(rank:9, rating:8.8, title: "One Flew Over the Cuckoo's Nest (1975)", votes: 699295).save(failOnError:true, flush:true)
			
			new Movie(rank:10, rating:8.8, title: 'The Lord of the Rings: The Return of the King (2003)', votes: 699295).save(failOnError:true, flush:true)
			new Movie(rank:11, rating:8.8, title: '	Star Wars: Episode V - The Empire Strikes Back (1980)', votes: 699295).save(failOnError:true, flush:true)
			new Movie(rank:12, rating:8.8, title: 'Fight Club (1999)', votes: 699295).save(failOnError:true, flush:true)
			new Movie(rank:13, rating:8.8, title: '	Inception (2010)', votes: 699295).save(failOnError:true, flush:true)
			new Movie(rank:14, rating:8.8, title: '	Shichinin no samurai (1954)', votes: 699295).save(failOnError:true, flush:true)
			new Movie(rank:15, rating:8.7, title: 'The Lord of the Rings: The Fellowship of the Ring (2001)', votes: 699295).save(failOnError:true, flush:true)
			new Movie(rank:16, rating:8.7, title: 'Goodfellas (1990)', votes: 699295).save(failOnError:true, flush:true)
			new Movie(rank:17, rating:8.7, title: '	Star Wars (1977)', votes: 699295).save(failOnError:true, flush:true)
		}
    }
    def destroy = {
    }
}
