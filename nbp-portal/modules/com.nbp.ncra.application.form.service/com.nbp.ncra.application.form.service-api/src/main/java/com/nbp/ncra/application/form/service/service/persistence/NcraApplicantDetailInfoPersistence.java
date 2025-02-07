/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncra.application.form.service.exception.NoSuchNcraApplicantDetailInfoException;
import com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncra applicant detail info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicantDetailInfoUtil
 * @generated
 */
@ProviderType
public interface NcraApplicantDetailInfoPersistence
	extends BasePersistence<NcraApplicantDetailInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcraApplicantDetailInfoUtil} to access the ncra applicant detail info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncra applicant detail info where ncraApplicationId = &#63; or throws a <code>NoSuchNcraApplicantDetailInfoException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra applicant detail info
	 * @throws NoSuchNcraApplicantDetailInfoException if a matching ncra applicant detail info could not be found
	 */
	public NcraApplicantDetailInfo findBygetNcraDetail_By_App_Id(
			long ncraApplicationId)
		throws NoSuchNcraApplicantDetailInfoException;

	/**
	 * Returns the ncra applicant detail info where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra applicant detail info, or <code>null</code> if a matching ncra applicant detail info could not be found
	 */
	public NcraApplicantDetailInfo fetchBygetNcraDetail_By_App_Id(
		long ncraApplicationId);

	/**
	 * Returns the ncra applicant detail info where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra applicant detail info, or <code>null</code> if a matching ncra applicant detail info could not be found
	 */
	public NcraApplicantDetailInfo fetchBygetNcraDetail_By_App_Id(
		long ncraApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncra applicant detail info where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra applicant detail info that was removed
	 */
	public NcraApplicantDetailInfo removeBygetNcraDetail_By_App_Id(
			long ncraApplicationId)
		throws NoSuchNcraApplicantDetailInfoException;

	/**
	 * Returns the number of ncra applicant detail infos where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra applicant detail infos
	 */
	public int countBygetNcraDetail_By_App_Id(long ncraApplicationId);

	/**
	 * Caches the ncra applicant detail info in the entity cache if it is enabled.
	 *
	 * @param ncraApplicantDetailInfo the ncra applicant detail info
	 */
	public void cacheResult(NcraApplicantDetailInfo ncraApplicantDetailInfo);

	/**
	 * Caches the ncra applicant detail infos in the entity cache if it is enabled.
	 *
	 * @param ncraApplicantDetailInfos the ncra applicant detail infos
	 */
	public void cacheResult(
		java.util.List<NcraApplicantDetailInfo> ncraApplicantDetailInfos);

	/**
	 * Creates a new ncra applicant detail info with the primary key. Does not add the ncra applicant detail info to the database.
	 *
	 * @param ncraApplicantDetailInfoId the primary key for the new ncra applicant detail info
	 * @return the new ncra applicant detail info
	 */
	public NcraApplicantDetailInfo create(long ncraApplicantDetailInfoId);

	/**
	 * Removes the ncra applicant detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraApplicantDetailInfoId the primary key of the ncra applicant detail info
	 * @return the ncra applicant detail info that was removed
	 * @throws NoSuchNcraApplicantDetailInfoException if a ncra applicant detail info with the primary key could not be found
	 */
	public NcraApplicantDetailInfo remove(long ncraApplicantDetailInfoId)
		throws NoSuchNcraApplicantDetailInfoException;

	public NcraApplicantDetailInfo updateImpl(
		NcraApplicantDetailInfo ncraApplicantDetailInfo);

	/**
	 * Returns the ncra applicant detail info with the primary key or throws a <code>NoSuchNcraApplicantDetailInfoException</code> if it could not be found.
	 *
	 * @param ncraApplicantDetailInfoId the primary key of the ncra applicant detail info
	 * @return the ncra applicant detail info
	 * @throws NoSuchNcraApplicantDetailInfoException if a ncra applicant detail info with the primary key could not be found
	 */
	public NcraApplicantDetailInfo findByPrimaryKey(
			long ncraApplicantDetailInfoId)
		throws NoSuchNcraApplicantDetailInfoException;

	/**
	 * Returns the ncra applicant detail info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraApplicantDetailInfoId the primary key of the ncra applicant detail info
	 * @return the ncra applicant detail info, or <code>null</code> if a ncra applicant detail info with the primary key could not be found
	 */
	public NcraApplicantDetailInfo fetchByPrimaryKey(
		long ncraApplicantDetailInfoId);

	/**
	 * Returns all the ncra applicant detail infos.
	 *
	 * @return the ncra applicant detail infos
	 */
	public java.util.List<NcraApplicantDetailInfo> findAll();

	/**
	 * Returns a range of all the ncra applicant detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicantDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applicant detail infos
	 * @param end the upper bound of the range of ncra applicant detail infos (not inclusive)
	 * @return the range of ncra applicant detail infos
	 */
	public java.util.List<NcraApplicantDetailInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncra applicant detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicantDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applicant detail infos
	 * @param end the upper bound of the range of ncra applicant detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra applicant detail infos
	 */
	public java.util.List<NcraApplicantDetailInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcraApplicantDetailInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the ncra applicant detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicantDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applicant detail infos
	 * @param end the upper bound of the range of ncra applicant detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra applicant detail infos
	 */
	public java.util.List<NcraApplicantDetailInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcraApplicantDetailInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncra applicant detail infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncra applicant detail infos.
	 *
	 * @return the number of ncra applicant detail infos
	 */
	public int countAll();

}