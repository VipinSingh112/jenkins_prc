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
 * The extended model interface for the CreativeDirectorListinAddBox service. Represents a row in the &quot;nbp_creative_director_box&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeDirectorListinAddBoxModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.creative.application.form.service.model.impl.CreativeDirectorListinAddBoxImpl"
)
@ProviderType
public interface CreativeDirectorListinAddBox
	extends CreativeDirectorListinAddBoxModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.creative.application.form.service.model.impl.CreativeDirectorListinAddBoxImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CreativeDirectorListinAddBox, Long>
		CREATIVE_DIRECTOR_BOX_ID_ACCESSOR =
			new Accessor<CreativeDirectorListinAddBox, Long>() {

				@Override
				public Long get(
					CreativeDirectorListinAddBox creativeDirectorListinAddBox) {

					return creativeDirectorListinAddBox.
						getCreativeDirectorBoxId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CreativeDirectorListinAddBox> getTypeClass() {
					return CreativeDirectorListinAddBox.class;
				}

			};

}