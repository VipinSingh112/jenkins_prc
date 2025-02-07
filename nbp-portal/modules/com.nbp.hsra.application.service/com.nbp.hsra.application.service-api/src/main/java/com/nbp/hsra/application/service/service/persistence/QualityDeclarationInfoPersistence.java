/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchQualityDeclarationInfoException;
import com.nbp.hsra.application.service.model.QualityDeclarationInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quality declaration info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualityDeclarationInfoUtil
 * @generated
 */
@ProviderType
public interface QualityDeclarationInfoPersistence
	extends BasePersistence<QualityDeclarationInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QualityDeclarationInfoUtil} to access the quality declaration info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the quality declaration info where hsraApplicationId = &#63; or throws a <code>NoSuchQualityDeclarationInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality declaration info
	 * @throws NoSuchQualityDeclarationInfoException if a matching quality declaration info could not be found
	 */
	public QualityDeclarationInfo findBygetHsraById(long hsraApplicationId)
		throws NoSuchQualityDeclarationInfoException;

	/**
	 * Returns the quality declaration info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality declaration info, or <code>null</code> if a matching quality declaration info could not be found
	 */
	public QualityDeclarationInfo fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the quality declaration info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quality declaration info, or <code>null</code> if a matching quality declaration info could not be found
	 */
	public QualityDeclarationInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the quality declaration info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the quality declaration info that was removed
	 */
	public QualityDeclarationInfo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchQualityDeclarationInfoException;

	/**
	 * Returns the number of quality declaration infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching quality declaration infos
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the quality declaration info in the entity cache if it is enabled.
	 *
	 * @param qualityDeclarationInfo the quality declaration info
	 */
	public void cacheResult(QualityDeclarationInfo qualityDeclarationInfo);

	/**
	 * Caches the quality declaration infos in the entity cache if it is enabled.
	 *
	 * @param qualityDeclarationInfos the quality declaration infos
	 */
	public void cacheResult(
		java.util.List<QualityDeclarationInfo> qualityDeclarationInfos);

	/**
	 * Creates a new quality declaration info with the primary key. Does not add the quality declaration info to the database.
	 *
	 * @param qualityDeclarationInfoId the primary key for the new quality declaration info
	 * @return the new quality declaration info
	 */
	public QualityDeclarationInfo create(long qualityDeclarationInfoId);

	/**
	 * Removes the quality declaration info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualityDeclarationInfoId the primary key of the quality declaration info
	 * @return the quality declaration info that was removed
	 * @throws NoSuchQualityDeclarationInfoException if a quality declaration info with the primary key could not be found
	 */
	public QualityDeclarationInfo remove(long qualityDeclarationInfoId)
		throws NoSuchQualityDeclarationInfoException;

	public QualityDeclarationInfo updateImpl(
		QualityDeclarationInfo qualityDeclarationInfo);

	/**
	 * Returns the quality declaration info with the primary key or throws a <code>NoSuchQualityDeclarationInfoException</code> if it could not be found.
	 *
	 * @param qualityDeclarationInfoId the primary key of the quality declaration info
	 * @return the quality declaration info
	 * @throws NoSuchQualityDeclarationInfoException if a quality declaration info with the primary key could not be found
	 */
	public QualityDeclarationInfo findByPrimaryKey(
			long qualityDeclarationInfoId)
		throws NoSuchQualityDeclarationInfoException;

	/**
	 * Returns the quality declaration info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualityDeclarationInfoId the primary key of the quality declaration info
	 * @return the quality declaration info, or <code>null</code> if a quality declaration info with the primary key could not be found
	 */
	public QualityDeclarationInfo fetchByPrimaryKey(
		long qualityDeclarationInfoId);

	/**
	 * Returns all the quality declaration infos.
	 *
	 * @return the quality declaration infos
	 */
	public java.util.List<QualityDeclarationInfo> findAll();

	/**
	 * Returns a range of all the quality declaration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityDeclarationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality declaration infos
	 * @param end the upper bound of the range of quality declaration infos (not inclusive)
	 * @return the range of quality declaration infos
	 */
	public java.util.List<QualityDeclarationInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the quality declaration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityDeclarationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality declaration infos
	 * @param end the upper bound of the range of quality declaration infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quality declaration infos
	 */
	public java.util.List<QualityDeclarationInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QualityDeclarationInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quality declaration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityDeclarationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality declaration infos
	 * @param end the upper bound of the range of quality declaration infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quality declaration infos
	 */
	public java.util.List<QualityDeclarationInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QualityDeclarationInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quality declaration infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quality declaration infos.
	 *
	 * @return the number of quality declaration infos
	 */
	public int countAll();

}