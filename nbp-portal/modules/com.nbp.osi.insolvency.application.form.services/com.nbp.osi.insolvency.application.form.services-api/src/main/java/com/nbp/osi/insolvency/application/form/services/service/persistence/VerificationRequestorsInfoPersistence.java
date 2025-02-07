/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchVerificationRequestorsInfoException;
import com.nbp.osi.insolvency.application.form.services.model.VerificationRequestorsInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the verification requestors info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VerificationRequestorsInfoUtil
 * @generated
 */
@ProviderType
public interface VerificationRequestorsInfoPersistence
	extends BasePersistence<VerificationRequestorsInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VerificationRequestorsInfoUtil} to access the verification requestors info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the verification requestors info where osiInsolvencyId = &#63; or throws a <code>NoSuchVerificationRequestorsInfoException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching verification requestors info
	 * @throws NoSuchVerificationRequestorsInfoException if a matching verification requestors info could not be found
	 */
	public VerificationRequestorsInfo findBygetOsiById(long osiInsolvencyId)
		throws NoSuchVerificationRequestorsInfoException;

	/**
	 * Returns the verification requestors info where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching verification requestors info, or <code>null</code> if a matching verification requestors info could not be found
	 */
	public VerificationRequestorsInfo fetchBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the verification requestors info where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching verification requestors info, or <code>null</code> if a matching verification requestors info could not be found
	 */
	public VerificationRequestorsInfo fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the verification requestors info where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the verification requestors info that was removed
	 */
	public VerificationRequestorsInfo removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchVerificationRequestorsInfoException;

	/**
	 * Returns the number of verification requestors infos where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching verification requestors infos
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the verification requestors info in the entity cache if it is enabled.
	 *
	 * @param verificationRequestorsInfo the verification requestors info
	 */
	public void cacheResult(
		VerificationRequestorsInfo verificationRequestorsInfo);

	/**
	 * Caches the verification requestors infos in the entity cache if it is enabled.
	 *
	 * @param verificationRequestorsInfos the verification requestors infos
	 */
	public void cacheResult(
		java.util.List<VerificationRequestorsInfo> verificationRequestorsInfos);

	/**
	 * Creates a new verification requestors info with the primary key. Does not add the verification requestors info to the database.
	 *
	 * @param requestorInformationId the primary key for the new verification requestors info
	 * @return the new verification requestors info
	 */
	public VerificationRequestorsInfo create(long requestorInformationId);

	/**
	 * Removes the verification requestors info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requestorInformationId the primary key of the verification requestors info
	 * @return the verification requestors info that was removed
	 * @throws NoSuchVerificationRequestorsInfoException if a verification requestors info with the primary key could not be found
	 */
	public VerificationRequestorsInfo remove(long requestorInformationId)
		throws NoSuchVerificationRequestorsInfoException;

	public VerificationRequestorsInfo updateImpl(
		VerificationRequestorsInfo verificationRequestorsInfo);

	/**
	 * Returns the verification requestors info with the primary key or throws a <code>NoSuchVerificationRequestorsInfoException</code> if it could not be found.
	 *
	 * @param requestorInformationId the primary key of the verification requestors info
	 * @return the verification requestors info
	 * @throws NoSuchVerificationRequestorsInfoException if a verification requestors info with the primary key could not be found
	 */
	public VerificationRequestorsInfo findByPrimaryKey(
			long requestorInformationId)
		throws NoSuchVerificationRequestorsInfoException;

	/**
	 * Returns the verification requestors info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param requestorInformationId the primary key of the verification requestors info
	 * @return the verification requestors info, or <code>null</code> if a verification requestors info with the primary key could not be found
	 */
	public VerificationRequestorsInfo fetchByPrimaryKey(
		long requestorInformationId);

	/**
	 * Returns all the verification requestors infos.
	 *
	 * @return the verification requestors infos
	 */
	public java.util.List<VerificationRequestorsInfo> findAll();

	/**
	 * Returns a range of all the verification requestors infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors infos
	 * @param end the upper bound of the range of verification requestors infos (not inclusive)
	 * @return the range of verification requestors infos
	 */
	public java.util.List<VerificationRequestorsInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the verification requestors infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors infos
	 * @param end the upper bound of the range of verification requestors infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of verification requestors infos
	 */
	public java.util.List<VerificationRequestorsInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<VerificationRequestorsInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the verification requestors infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors infos
	 * @param end the upper bound of the range of verification requestors infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of verification requestors infos
	 */
	public java.util.List<VerificationRequestorsInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<VerificationRequestorsInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the verification requestors infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of verification requestors infos.
	 *
	 * @return the number of verification requestors infos
	 */
	public int countAll();

}