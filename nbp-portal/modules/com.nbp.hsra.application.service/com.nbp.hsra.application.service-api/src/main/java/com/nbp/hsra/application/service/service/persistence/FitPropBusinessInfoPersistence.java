/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchFitPropBusinessInfoException;
import com.nbp.hsra.application.service.model.FitPropBusinessInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fit prop business info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FitPropBusinessInfoUtil
 * @generated
 */
@ProviderType
public interface FitPropBusinessInfoPersistence
	extends BasePersistence<FitPropBusinessInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FitPropBusinessInfoUtil} to access the fit prop business info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the fit prop business info where hsraApplicationId = &#63; or throws a <code>NoSuchFitPropBusinessInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop business info
	 * @throws NoSuchFitPropBusinessInfoException if a matching fit prop business info could not be found
	 */
	public FitPropBusinessInfo findBygetHsraById(long hsraApplicationId)
		throws NoSuchFitPropBusinessInfoException;

	/**
	 * Returns the fit prop business info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop business info, or <code>null</code> if a matching fit prop business info could not be found
	 */
	public FitPropBusinessInfo fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the fit prop business info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fit prop business info, or <code>null</code> if a matching fit prop business info could not be found
	 */
	public FitPropBusinessInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the fit prop business info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the fit prop business info that was removed
	 */
	public FitPropBusinessInfo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchFitPropBusinessInfoException;

	/**
	 * Returns the number of fit prop business infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching fit prop business infos
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the fit prop business info in the entity cache if it is enabled.
	 *
	 * @param fitPropBusinessInfo the fit prop business info
	 */
	public void cacheResult(FitPropBusinessInfo fitPropBusinessInfo);

	/**
	 * Caches the fit prop business infos in the entity cache if it is enabled.
	 *
	 * @param fitPropBusinessInfos the fit prop business infos
	 */
	public void cacheResult(
		java.util.List<FitPropBusinessInfo> fitPropBusinessInfos);

	/**
	 * Creates a new fit prop business info with the primary key. Does not add the fit prop business info to the database.
	 *
	 * @param fitPropBusinessInfoId the primary key for the new fit prop business info
	 * @return the new fit prop business info
	 */
	public FitPropBusinessInfo create(long fitPropBusinessInfoId);

	/**
	 * Removes the fit prop business info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fitPropBusinessInfoId the primary key of the fit prop business info
	 * @return the fit prop business info that was removed
	 * @throws NoSuchFitPropBusinessInfoException if a fit prop business info with the primary key could not be found
	 */
	public FitPropBusinessInfo remove(long fitPropBusinessInfoId)
		throws NoSuchFitPropBusinessInfoException;

	public FitPropBusinessInfo updateImpl(
		FitPropBusinessInfo fitPropBusinessInfo);

	/**
	 * Returns the fit prop business info with the primary key or throws a <code>NoSuchFitPropBusinessInfoException</code> if it could not be found.
	 *
	 * @param fitPropBusinessInfoId the primary key of the fit prop business info
	 * @return the fit prop business info
	 * @throws NoSuchFitPropBusinessInfoException if a fit prop business info with the primary key could not be found
	 */
	public FitPropBusinessInfo findByPrimaryKey(long fitPropBusinessInfoId)
		throws NoSuchFitPropBusinessInfoException;

	/**
	 * Returns the fit prop business info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fitPropBusinessInfoId the primary key of the fit prop business info
	 * @return the fit prop business info, or <code>null</code> if a fit prop business info with the primary key could not be found
	 */
	public FitPropBusinessInfo fetchByPrimaryKey(long fitPropBusinessInfoId);

	/**
	 * Returns all the fit prop business infos.
	 *
	 * @return the fit prop business infos
	 */
	public java.util.List<FitPropBusinessInfo> findAll();

	/**
	 * Returns a range of all the fit prop business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop business infos
	 * @param end the upper bound of the range of fit prop business infos (not inclusive)
	 * @return the range of fit prop business infos
	 */
	public java.util.List<FitPropBusinessInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the fit prop business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop business infos
	 * @param end the upper bound of the range of fit prop business infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fit prop business infos
	 */
	public java.util.List<FitPropBusinessInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FitPropBusinessInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the fit prop business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop business infos
	 * @param end the upper bound of the range of fit prop business infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fit prop business infos
	 */
	public java.util.List<FitPropBusinessInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FitPropBusinessInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fit prop business infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fit prop business infos.
	 *
	 * @return the number of fit prop business infos
	 */
	public int countAll();

}