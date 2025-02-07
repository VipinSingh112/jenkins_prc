/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the JadscAppliFinalDeter service. Represents a row in the &quot;nbp_jadsc_appli_final_deter&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliFinalDeterModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jadsc.stage.services.model.impl.JadscAppliFinalDeterImpl"
)
@ProviderType
public interface JadscAppliFinalDeter
	extends JadscAppliFinalDeterModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliFinalDeterImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JadscAppliFinalDeter, Long>
		JADSC_APPLI_FINAL_DETER_ID_ACCESSOR =
			new Accessor<JadscAppliFinalDeter, Long>() {

				@Override
				public Long get(JadscAppliFinalDeter jadscAppliFinalDeter) {
					return jadscAppliFinalDeter.getJadscAppliFinalDeterId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<JadscAppliFinalDeter> getTypeClass() {
					return JadscAppliFinalDeter.class;
				}

			};

}