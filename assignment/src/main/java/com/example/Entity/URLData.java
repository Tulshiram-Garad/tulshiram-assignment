package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class URLData {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String url;
	    private String metadata;
	    
		public URLData(Long id, String url, String metadata) {
			super();
			this.id = id;
			this.url = url;
			this.metadata = metadata;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getMetadata() {
			return metadata;
		}
		public void setMetadata(String metadata) {
			this.metadata = metadata;
		}
		@Override
		public String toString() {
			return "URLData [id=" + id + ", url=" + url + ", metadata=" + metadata + "]";
		}
      
	}

