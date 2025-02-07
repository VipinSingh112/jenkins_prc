/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchGenerateEquipmentInfoException;
import com.nbp.hsra.application.service.model.GenerateEquipmentInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the generate equipment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GenerateEquipmentInfoUtil
 * @generated
 */
@ProviderType
public interface GenerateEquipmentInfoPersistence
	extends BasePersistence<GenerateEquipmentInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GenerateEquipmentInfoUtil} to access the generate equipment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the generate equipment info where hsraApplicationId = &#63; or throws a <code>NoSuchGenerateEquipmentInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching generate equipment info
	 * @throws NoSuchGenerateEquipmentInfoException if a matching generate equipment info could not be found
	 */
	public GenerateEquipmentInfo findBygetHsraById(long hsraApplicationId)
		throws NoSuchGenerateEquipmentInfoException;

	/**
	 * Returns the generate equipment info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching generate equipment info, or <code>null</code> if a matching generate equipment info could not be found
	 */
	public GenerateEquipmentInfo fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the generate equipment info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching generate equipment info, or <code>null</code> if a matching generate equipment info could not be found
	 */
	public GenerateEquipmentInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the generate equipment info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the generate equipment info that was removed
	 */
	public GenerateEquipmentInfo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchGenerateEquipmentInfoException;

	/**
	 * Returns the number of generate equipment infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching generate equipment infos
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the generate equipment info in the entity cache if it is enabled.
	 *
	 * @param generateEquipmentInfo the generate equipment info
	 */
	public void cacheResult(GenerateEquipmentInfo generateEquipmentInfo);

	/**
	 * Caches the generate equipment infos in the entity cache if it is enabled.
	 *
	 * @param generateEquipmentInfos the generate equipment infos
	 */
	public void cacheResult(
		java.util.List<GenerateEquipmentInfo> generateEquipmentInfos);

	/**
	 * Creates a new generate equipment info with the primary key. Does not add the generate equipment info to the database.
	 *
	 * @param GenerateEquipmentInfoId the primary key for the new generate equipment info
	 * @return the new generate equipment info
	 */
	public GenerateEquipmentInfo create(long GenerateEquipmentInfoId);

	/**
	 * Removes the generate equipment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param GenerateEquipmentInfoId the primary key of the generate equipment info
	 * @return the generate equipment info that was removed
	 * @throws NoSuchGenerateEquipmentInfoException if a generate equipment info with the primary key could not be found
	 */
	public GenerateEquipmentInfo remove(long GenerateEquipmentInfoId)
		throws NoSuchGenerateEquipmentInfoException;

	public GenerateEquipmentInfo updateImpl(
		GenerateEquipmentInfo generateEquipmentInfo);

	/**
	 * Returns the generate equipment info with the primary key or throws a <code>NoSuchGenerateEquipmentInfoException</code> if it could not be found.
	 *
	 * @param GenerateEquipmentInfoId the primary key of the generate equipment info
	 * @return the generate equipment info
	 * @throws NoSuchGenerateEquipmentInfoException if a generate equipment info with the primary key could not be found
	 */
	public GenerateEquipmentInfo findByPrimaryKey(long GenerateEquipmentInfoId)
		throws NoSuchGenerateEquipmentInfoException;

	/**
	 * Returns the generate equipment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param GenerateEquipmentInfoId the primary key of the generate equipment info
	 * @return the generate equipment info, or <code>null</code> if a generate equipment info with the primary key could not be found
	 */
	public GenerateEquipmentInfo fetchByPrimaryKey(
		long GenerateEquipmentInfoId);

	/**
	 * Returns all the generate equipment infos.
	 *
	 * @return the generate equipment infos
	 */
	public java.util.List<GenerateEquipmentInfo> findAll();

	/**
	 * Returns a range of all the generate equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenerateEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of generate equipment infos
	 * @param end the upper bound of the range of generate equipment infos (not inclusive)
	 * @return the range of generate equipment infos
	 */
	public java.util.List<GenerateEquipmentInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the generate equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenerateEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of generate equipment infos
	 * @param end the upper bound of the range of generate equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of generate equipment infos
	 */
	public java.util.List<GenerateEquipmentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GenerateEquipmentInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the generate equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenerateEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of generate equipment infos
	 * @param end the upper bound of the range of generate equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of generate equipment infos
	 */
	public java.util.List<GenerateEquipmentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GenerateEquipmentInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the generate equipment infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of generate equipment infos.
	 *
	 * @return the number of generate equipment infos
	 */
	public int countAll();

}