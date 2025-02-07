/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AgricultureFarm service. Represents a row in the &quot;agriculture_farm&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureFarmModel
 * @generated
 */
@ImplementationClassName(
	"com.agriculture.application.form.service.model.impl.AgricultureFarmImpl"
)
@ProviderType
public interface AgricultureFarm extends AgricultureFarmModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.agriculture.application.form.service.model.impl.AgricultureFarmImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AgricultureFarm, Long>
		AGRICULTURE_FARM_ID_ACCESSOR = new Accessor<AgricultureFarm, Long>() {

			@Override
			public Long get(AgricultureFarm agricultureFarm) {
				return agricultureFarm.getAgricultureFarmId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AgricultureFarm> getTypeClass() {
				return AgricultureFarm.class;
			}

		};

}