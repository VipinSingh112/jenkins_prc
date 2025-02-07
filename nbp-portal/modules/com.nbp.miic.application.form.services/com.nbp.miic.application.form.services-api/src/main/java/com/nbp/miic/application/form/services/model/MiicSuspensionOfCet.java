/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the MiicSuspensionOfCet service. Represents a row in the &quot;nbp_miic_Suspension&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MiicSuspensionOfCetModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetImpl"
)
@ProviderType
public interface MiicSuspensionOfCet
	extends MiicSuspensionOfCetModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MiicSuspensionOfCet, Long>
		MIIC_SUSPENSION_OF_CET_ID_ACCESSOR =
			new Accessor<MiicSuspensionOfCet, Long>() {

				@Override
				public Long get(MiicSuspensionOfCet miicSuspensionOfCet) {
					return miicSuspensionOfCet.getMiicSuspensionOfCetId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MiicSuspensionOfCet> getTypeClass() {
					return MiicSuspensionOfCet.class;
				}

			};

}