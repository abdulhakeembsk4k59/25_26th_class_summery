import React, { useState } from 'react';
import './App.css';
function TabComponent() {
  const [activeTab, setActiveTab] = useState('tab1');

  const openTab = (tabName) => {
    setActiveTab(tabName);
  };

  return (
    <div>
      <div
        className={`tab ${activeTab === 'tab1' ? 'active' : ''}`}
        onClick={() => openTab('tab1')}
      >
        Tab 1
      </div>
      <div
        className={`tab ${activeTab === 'tab2' ? 'active' : ''}`}
        onClick={() => openTab('tab2')}
      >
        Tab 2
      </div>
      <div
        className={`tab ${activeTab === 'tab3' ? 'active' : ''}`}
        onClick={() => openTab('tab3')}
      >
        Tab 3
      </div>

      <div
        id="tab1"
        className={`panel ${activeTab === 'tab1' ? 'active' : ''}`}
      >
        Panel 1
      </div>
      <div id="tab2" className={`panel ${activeTab === 'tab2' ? 'active' : ''}`}>
        Panel 2
      </div>
      <div id="tab3" className={`panel ${activeTab === 'tab3' ? 'active' : ''}`}>
        Panel 3
      </div>
    </div>
  );
}

export default TabComponent;
