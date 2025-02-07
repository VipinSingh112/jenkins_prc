/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.quary.application.form.service.exception.NoSuchQuarryTransferApplicantInfoException;
import com.nbp.quary.application.form.service.model.QuarryTransferApplicantInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quarry transfer applicant info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryTransferApplicantInfoUtil
 * @generated
 */
@ProviderType
public interface QuarryTransferApplicantInfoPersistence
	extends BasePersistence<QuarryTransferApplicantInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuarryTransferApplicantInfoUtil} to access the quarry transfer applicant info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the quarry transfer applicant info where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryTransferApplicantInfoException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry transfer applicant info
	 * @throws NoSuchQuarryTransferApplicantInfoException if a matching quarry transfer applicant info could not be found
	 */
	public QuarryTransferApplicantInfo findBygetQuarry_ById(
			long quarryApplicationId)
		throws NoSuchQuarryTransferApplicantInfoException;

	/**
	 * Returns the quarry transfer applicant info where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry transfer applicant info, or <code>null</code> if a matching quarry transfer applicant info could not be found
	 */
	public QuarryTransferApplicantInfo fetchBygetQuarry_ById(
		long quarryApplicationId);

	/**
	 * Returns the quarry transfer applicant info where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry transfer applicant info, or <code>null</code> if a matching quarry transfer applicant info could not be found
	 */
	public QuarryTransferApplicantInfo fetchBygetQuarry_ById(
		long quarryApplicationId, boolean useFinderCache);

	/**
	 * Removes the quarry transfer applicant info where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry transfer applicant info that was removed
	 */
	public QuarryTransferApplicantInfo removeBygetQuarry_ById(
			long quarryApplicationId)
		throws NoSuchQuarryTransferApplicantInfoException;

	/**
	 * Returns the number of quarry transfer applicant infos where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry transfer applicant infos
	 */
	public int countBygetQuarry_ById(long quarryApplicationId);

	/**
	 * Caches the quarry transfer applicant info in the entity cache if it is enabled.
	 *
	 * @param quarryTransferApplicantInfo the quarry transfer applicant info
	 */
	public void cacheResult(
		QuarryTransferApplicantInfo quarryTransferApplicantInfo);

	/**
	 * Caches the quarry transfer applicant infos in the entity cache if it is enabled.
	 *
	 * @param quarryTransferApplicantInfos the quarry transfer applicant infos
	 */
	public void cacheResult(
		java.util.List<QuarryTransferApplicantInfo>
			quarryTransferApplicantInfos);

	/**
	 * Creates a new quarry transfer applicant info with the primary key. Does not add the quarry transfer applicant info to the database.
	 *
	 * @param quarryTransferInfoId the primary key for the new quarry transfer applicant info
	 * @return the new quarry transfer applicant info
	 */
	public QuarryTransferApplicantInfo create(long quarryTransferInfoId);

	/**
	 * Removes the quarry transfer applicant info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryTransferInfoId the primary key of the quarry transfer applicant info
	 * @return the quarry transfer applicant info that was removed
	 * @throws NoSuchQuarryTransferApplicantInfoException if a quarry transfer applicant info with the primary key could not be found
	 */
	public QuarryTransferApplicantInfo remove(long quarryTransferInfoId)
		throws NoSuchQuarryTransferApplicantInfoException;

	public QuarryTransferApplicantInfo updateImpl(
		QuarryTransferApplicantInfo quarryTransferApplicantInfo);

	/**
	 * Returns the quarry transfer applicant info with the primary key or throws a <code>NoSuchQuarryTransferApplicantInfoException</code> if it could not be found.
	 *
	 * @param quarryTransferInfoId the primary key of the quarry transfer applicant info
	 * @return the quarry transfer applicant info
	 * @throws NoSuchQuarryTransferApplicantInfoException if a quarry transfer applicant info with the primary key could not be found
	 */
	public QuarryTransferApplicantInfo findByPrimaryKey(
			long quarryTransferInfoId)
		throws NoSuchQuarryTransferApplicantInfoException;

	/**
	 * Returns the quarry transfer applicant info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryTransferInfoId the primary key of the quarry transfer applicant info
	 * @return the quarry transfer applicant info, or <code>null</code> if a quarry transfer applicant info with the primary key could not be found
	 */
	public QuarryTransferApplicantInfo fetchByPrimaryKey(
		long quarryTransferInfoId);

	/**
	 * Returns all the quarry transfer applicant infos.
	 *
	 * @return the quarry transfer applicant infos
	 */
	public java.util.List<QuarryTransferApplicantInfo> findAll();

	/**
	 * Returns a range of all the quarry transfer applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryTransferApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry transfer applicant infos
	 * @param end the upper bound of the range of quarry transfer applicant infos (not inclusive)
	 * @return the range of quarry transfer applicant infos
	 */
	public java.util.List<QuarryTransferApplicantInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the quarry transfer applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryTransferApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry transfer applicant infos
	 * @param end the upper bound of the range of quarry transfer applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry transfer applicant infos
	 */
	public java.util.List<QuarryTransferApplicantInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryTransferApplicantInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the quarry transfer applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryTransferApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry transfer applicant infos
	 * @param end the upper bound of the range of quarry transfer applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry transfer applicant infos
	 */
	public java.util.List<QuarryTransferApplicantInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryTransferApplicantInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quarry transfer applicant infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quarry transfer applicant infos.
	 *
	 * @return the number of quarry transfer applicant infos
	 */
	public int countAll();

}