package br.com.consumer.financeiro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import br.com.consumer.financeiro.interfaces.services.IFinanceiro;
import br.com.consumer.financeiro.model.Financeiro;
import br.com.consumer.financeiro.repository.FinanceiroRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Slf4j
@RequiredArgsConstructor
@Service
public class FinanceiroService{
	
	@Value("${topic.name.consumer")
    private String topicName;

    @KafkaListener(topics = "${topic.name.consumer}", groupId = "group_id")
    public void consume(ConsumerRecord<String, String> payload){
    	try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}

    }
	
	
	
	
	
	
	
	
	//@Autowired
	//FinanceiroRepository financeiroRepo;
	
	//@Autowired
	//Financeiro model;
	
	//@Override
    //public List<Financeiro> getAll() {
        // TODO Auto-generated method stub
        //return financeiroRepo.findAll();
    //}
	
	/*public void objeto() {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("Nome", "QWERTY");
		jsonObj.put("Numero", "1221");	
		jsonObj.put("rg", "rg123");
		jsonObj.put("cpf", "cpf123");
		System.out.println(jsonObj);		
		model.setNome(jsonObj.get("Nome").toString());
		model.setTelefone(jsonObj.get("Numero").toString());
		model.setRg(jsonObj.get("rg").toString());
		model.setCpf(jsonObj.get("cpf").toString());
		//financeiroRepo.save(model);
	}*/
}
