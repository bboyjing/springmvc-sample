package cn.didadu.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by jinggg on 16/4/18.
 */

@Scope("prototype")
@Service
public class DemoPrototypeService {
}
