/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the CreativeContactInfoAddBox service. Represents a row in the &quot;nbp_creative_contact_box&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeContactInfoAddBoxModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.creative.application.form.service.model.impl.CreativeContactInfoAddBoxImpl"
)
@ProviderType
public interface CreativeContactInfoAddBox
	extends CreativeContactInfoAddBoxModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.creative.application.form.service.model.impl.CreativeContactInfoAddBoxImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CreativeContactInfoAddBox, Long>
		CREATIVE_CONTACT_BOX_ID_ACCESSOR =
			new Accessor<CreativeContactInfoAddBox, Long>() {

				@Override
				public Long get(
					CreativeContactInfoAddBox creativeContactInfoAddBox) {

					return creativeContactInfoAddBox.getCreativeContactBoxId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CreativeContactInfoAddBox> getTypeClass() {
					return CreativeContactInfoAddBox.class;
				}

			};

}