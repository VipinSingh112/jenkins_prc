/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchFitPropPersonalDetailInfoException;
import com.nbp.hsra.application.service.model.FitPropPersonalDetailInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fit prop personal detail info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FitPropPersonalDetailInfoUtil
 * @generated
 */
@ProviderType
public interface FitPropPersonalDetailInfoPersistence
	extends BasePersistence<FitPropPersonalDetailInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FitPropPersonalDetailInfoUtil} to access the fit prop personal detail info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the fit prop personal detail info where hsraApplicationId = &#63; or throws a <code>NoSuchFitPropPersonalDetailInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop personal detail info
	 * @throws NoSuchFitPropPersonalDetailInfoException if a matching fit prop personal detail info could not be found
	 */
	public FitPropPersonalDetailInfo findBygetHsraById(long hsraApplicationId)
		throws NoSuchFitPropPersonalDetailInfoException;

	/**
	 * Returns the fit prop personal detail info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop personal detail info, or <code>null</code> if a matching fit prop personal detail info could not be found
	 */
	public FitPropPersonalDetailInfo fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the fit prop personal detail info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fit prop personal detail info, or <code>null</code> if a matching fit prop personal detail info could not be found
	 */
	public FitPropPersonalDetailInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the fit prop personal detail info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the fit prop personal detail info that was removed
	 */
	public FitPropPersonalDetailInfo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchFitPropPersonalDetailInfoException;

	/**
	 * Returns the number of fit prop personal detail infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching fit prop personal detail infos
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the fit prop personal detail info in the entity cache if it is enabled.
	 *
	 * @param fitPropPersonalDetailInfo the fit prop personal detail info
	 */
	public void cacheResult(
		FitPropPersonalDetailInfo fitPropPersonalDetailInfo);

	/**
	 * Caches the fit prop personal detail infos in the entity cache if it is enabled.
	 *
	 * @param fitPropPersonalDetailInfos the fit prop personal detail infos
	 */
	public void cacheResult(
		java.util.List<FitPropPersonalDetailInfo> fitPropPersonalDetailInfos);

	/**
	 * Creates a new fit prop personal detail info with the primary key. Does not add the fit prop personal detail info to the database.
	 *
	 * @param fitPropPersonalDetailInfoId the primary key for the new fit prop personal detail info
	 * @return the new fit prop personal detail info
	 */
	public FitPropPersonalDetailInfo create(long fitPropPersonalDetailInfoId);

	/**
	 * Removes the fit prop personal detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fitPropPersonalDetailInfoId the primary key of the fit prop personal detail info
	 * @return the fit prop personal detail info that was removed
	 * @throws NoSuchFitPropPersonalDetailInfoException if a fit prop personal detail info with the primary key could not be found
	 */
	public FitPropPersonalDetailInfo remove(long fitPropPersonalDetailInfoId)
		throws NoSuchFitPropPersonalDetailInfoException;

	public FitPropPersonalDetailInfo updateImpl(
		FitPropPersonalDetailInfo fitPropPersonalDetailInfo);

	/**
	 * Returns the fit prop personal detail info with the primary key or throws a <code>NoSuchFitPropPersonalDetailInfoException</code> if it could not be found.
	 *
	 * @param fitPropPersonalDetailInfoId the primary key of the fit prop personal detail info
	 * @return the fit prop personal detail info
	 * @throws NoSuchFitPropPersonalDetailInfoException if a fit prop personal detail info with the primary key could not be found
	 */
	public FitPropPersonalDetailInfo findByPrimaryKey(
			long fitPropPersonalDetailInfoId)
		throws NoSuchFitPropPersonalDetailInfoException;

	/**
	 * Returns the fit prop personal detail info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fitPropPersonalDetailInfoId the primary key of the fit prop personal detail info
	 * @return the fit prop personal detail info, or <code>null</code> if a fit prop personal detail info with the primary key could not be found
	 */
	public FitPropPersonalDetailInfo fetchByPrimaryKey(
		long fitPropPersonalDetailInfoId);

	/**
	 * Returns all the fit prop personal detail infos.
	 *
	 * @return the fit prop personal detail infos
	 */
	public java.util.List<FitPropPersonalDetailInfo> findAll();

	/**
	 * Returns a range of all the fit prop personal detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropPersonalDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop personal detail infos
	 * @param end the upper bound of the range of fit prop personal detail infos (not inclusive)
	 * @return the range of fit prop personal detail infos
	 */
	public java.util.List<FitPropPersonalDetailInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the fit prop personal detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropPersonalDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop personal detail infos
	 * @param end the upper bound of the range of fit prop personal detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fit prop personal detail infos
	 */
	public java.util.List<FitPropPersonalDetailInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FitPropPersonalDetailInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the fit prop personal detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropPersonalDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop personal detail infos
	 * @param end the upper bound of the range of fit prop personal detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fit prop personal detail infos
	 */
	public java.util.List<FitPropPersonalDetailInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FitPropPersonalDetailInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fit prop personal detail infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fit prop personal detail infos.
	 *
	 * @return the number of fit prop personal detail infos
	 */
	public int countAll();

}