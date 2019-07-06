package com.api;

import java.util.List;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


import java.util.ArrayList;



@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("10","SF","SFD"),
			new Topic("20","S2F","SwFD"),
			new Topic("3","SsF","SwFD")
			));
	
	public List <Topic> getAllTopics() {
		return topics;
	}

	
public Topic getTopic(String id) {
	return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	
	}

public void addTopic(Topic topic) {
	topics.add(topic);
}

}

/*public void updateTopic(Topic topic,String id) {
for(int i=0;i<topics.size();i++)	{
	}
}*/








