/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the WraInspection service. Represents a row in the &quot;nbp_wra_inspec&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see WraInspectionModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.wra.stage.service.model.impl.WraInspectionImpl"
)
@ProviderType
public interface WraInspection extends PersistedModel, WraInspectionModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.wra.stage.service.model.impl.WraInspectionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<WraInspection, Long>
		WRA_INSPECTION_ID_ACCESSOR = new Accessor<WraInspection, Long>() {

			@Override
			public Long get(WraInspection wraInspection) {
				return wraInspection.getWraInspectionId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<WraInspection> getTypeClass() {
				return WraInspection.class;
			}

		};

}