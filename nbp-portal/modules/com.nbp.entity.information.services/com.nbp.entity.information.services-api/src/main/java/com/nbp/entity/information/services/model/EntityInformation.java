/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.entity.information.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the EntityInformation service. Represents a row in the &quot;nbp_entity_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see EntityInformationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.entity.information.services.model.impl.EntityInformationImpl"
)
@ProviderType
public interface EntityInformation
	extends EntityInformationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.entity.information.services.model.impl.EntityInformationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<EntityInformation, Long>
		ENTITY_INFO_ID_ACCESSOR = new Accessor<EntityInformation, Long>() {

			@Override
			public Long get(EntityInformation entityInformation) {
				return entityInformation.getEntityInfoId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<EntityInformation> getTypeClass() {
				return EntityInformation.class;
			}

		};

}