package com.example.testkotloin
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class MainActivity: AppCompatActivity(), HasSupportFragmentInjector {
    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>
    override fun supportFragmentInjector() = fragmentDispatchingAndroidInjector

    @Inject lateinit var c:MyClass
    @Inject lateinit var info:Info
    @Inject lateinit var info2:Info2
    @Inject lateinit var info3:AppModule.Info3
    @Inject lateinit var p:InjectClass
    @Inject lateinit var p2:InjectClass2
    @Inject lateinit var a:AwesomeManager
    @Inject lateinit var a2:A
    @Inject lateinit var a3:AwesomeManager2
    @Inject lateinit var viewModel: MainActivityViewModel

    @Inject lateinit var up: UserPreference

    //val homeFragment = HomeFragment()
    lateinit var  homeFragment:HomeFragment
    lateinit var  homeFragment2:HomeFragment2
    val fragmentManager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //ถ้าไม่ inject ที่ AppInjector ต้อง Inject ข้างล่าง
        //AndroidInjection.inject(this)
        homeFragment = HomeFragment.newInstance(null,null)




        val fragmentTransaction = fragmentManager.beginTransaction()
        //FragmentContainerView is a custom View that extends FrameLayout
        //fragmentTransaction.add(R.id.fragment_container_view, homeFragment)
        //กรณีใช้ LayoutManager ตัวอื่นๆ
        fragmentTransaction.add(R.id.linear1, homeFragment)

        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
        //fragmentTransaction.remove(homeFragment)



        if(c==null){
            System.out.println("-------c is null")
        }else{
            System.out.println("-------c is not null name = "+c.name)
        }
        if(viewModel!=null){
            System.out.println("----------view model not null")
        }
        if(up==null){
            System.out.println("-------up = null")
        }else{
            System.out.println("-------up not null")
        }
        System.out.println("----Key Id = "+up.getInt())
        System.out.println("-------info = "+info.number)
        System.out.println("-------info2 = "+info2.number)
        System.out.println("-------info3 = "+info3.number)
        System.out.println("-------cName = "+c.name)
        /*if(a3!=null){
            System.out.println("--------a3 is not null")
        }*/
        setContentView(R.layout.activity_main)



    }
}
