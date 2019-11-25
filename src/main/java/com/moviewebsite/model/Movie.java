package com.moviewebsite.model;

/**
 * @author Peyton
 *
 */
public class Movie {

		private long id;
		
		private String title;
		
		private int yrRelease;
		
		private String category;
		
		private String rating;
		
		private boolean avNetflix;
		
		private boolean avPrime;
		
		private boolean avHbo;
		
		private boolean avHulu;
		
		private boolean avDisney;
		
		public Movie() {
			
		}
		
		

		public Movie(long id, String title, int yrRelease, String category, String rating, boolean avNetflix,
				boolean avPrime, boolean avHbo, boolean avHulu, boolean avDisney) {
			super();
			this.id = id;
			this.title = title;
			this.yrRelease = yrRelease;
			this.category = category;
			this.rating = rating;
			this.avNetflix = avNetflix;
			this.avPrime = avPrime;
			this.avHbo = avHbo;
			this.avHulu = avHulu;
			this.avDisney = avDisney;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getYrRelease() {
			return yrRelease;
		}

		public void setYrRelease(int yrRelease) {
			this.yrRelease = yrRelease;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getRating() {
			return rating;
		}

		public void setRating(String rating) {
			this.rating = rating;
		}

		public boolean isAvNetflix() {
			return avNetflix;
		}

		public void setAvNetflix(boolean avNetflix) {
			this.avNetflix = avNetflix;
		}

		public boolean isAvPrime() {
			return avPrime;
		}

		public void setAvPrime(boolean avPrime) {
			this.avPrime = avPrime;
		}

		public boolean isAvHbo() {
			return avHbo;
		}

		public void setAvHbo(boolean avHbo) {
			this.avHbo = avHbo;
		}

		public boolean isAvHulu() {
			return avHulu;
		}

		public void setAvHulu(boolean avHulu) {
			this.avHulu = avHulu;
		}

		public boolean isAvDisney() {
			return avDisney;
		}

		public void setAvDisney(boolean avDisney) {
			this.avDisney = avDisney;
		}



		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (avDisney ? 1231 : 1237);
			result = prime * result + (avHbo ? 1231 : 1237);
			result = prime * result + (avHulu ? 1231 : 1237);
			result = prime * result + (avNetflix ? 1231 : 1237);
			result = prime * result + (avPrime ? 1231 : 1237);
			result = prime * result + ((category == null) ? 0 : category.hashCode());
			result = prime * result + (int) (id ^ (id >>> 32));
			result = prime * result + ((rating == null) ? 0 : rating.hashCode());
			result = prime * result + ((title == null) ? 0 : title.hashCode());
			result = prime * result + yrRelease;
			return result;
		}



		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Movie other = (Movie) obj;
			if (avDisney != other.avDisney)
				return false;
			if (avHbo != other.avHbo)
				return false;
			if (avHulu != other.avHulu)
				return false;
			if (avNetflix != other.avNetflix)
				return false;
			if (avPrime != other.avPrime)
				return false;
			if (category == null) {
				if (other.category != null)
					return false;
			} else if (!category.equals(other.category))
				return false;
			if (id != other.id)
				return false;
			if (rating == null) {
				if (other.rating != null)
					return false;
			} else if (!rating.equals(other.rating))
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			if (yrRelease != other.yrRelease)
				return false;
			return true;
		}

		
		
}
