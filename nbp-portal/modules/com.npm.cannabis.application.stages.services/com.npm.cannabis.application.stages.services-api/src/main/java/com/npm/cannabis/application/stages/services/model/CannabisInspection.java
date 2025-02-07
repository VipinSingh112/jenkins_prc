/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the CannabisInspection service. Represents a row in the &quot;nbp_cannabis_inspection&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisInspectionModel
 * @generated
 */
@ImplementationClassName(
	"com.npm.cannabis.application.stages.services.model.impl.CannabisInspectionImpl"
)
@ProviderType
public interface CannabisInspection
	extends CannabisInspectionModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.npm.cannabis.application.stages.services.model.impl.CannabisInspectionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CannabisInspection, Long>
		CANNABIS_INSPECTION_ID_ACCESSOR =
			new Accessor<CannabisInspection, Long>() {

				@Override
				public Long get(CannabisInspection cannabisInspection) {
					return cannabisInspection.getCannabisInspectionId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CannabisInspection> getTypeClass() {
					return CannabisInspection.class;
				}

			};

}