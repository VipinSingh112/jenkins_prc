/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the JanaacInspection service. Represents a row in the &quot;nbp_janaac_inspection&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacInspectionModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.stages.services.model.impl.JanaacInspectionImpl"
)
@ProviderType
public interface JanaacInspection
	extends JanaacInspectionModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.stages.services.model.impl.JanaacInspectionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JanaacInspection, Long>
		JANAAC_INSPECTION_ID_ACCESSOR = new Accessor<JanaacInspection, Long>() {

			@Override
			public Long get(JanaacInspection janaacInspection) {
				return janaacInspection.getJanaacInspectionId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<JanaacInspection> getTypeClass() {
				return JanaacInspection.class;
			}

		};

}