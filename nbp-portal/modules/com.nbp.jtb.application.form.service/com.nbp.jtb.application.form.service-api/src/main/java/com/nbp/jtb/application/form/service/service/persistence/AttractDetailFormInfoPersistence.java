/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractDetailFormInfoException;
import com.nbp.jtb.application.form.service.model.AttractDetailFormInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the attract detail form info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractDetailFormInfoUtil
 * @generated
 */
@ProviderType
public interface AttractDetailFormInfoPersistence
	extends BasePersistence<AttractDetailFormInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttractDetailFormInfoUtil} to access the attract detail form info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the attract detail form info where jtbApplicationId = &#63; or throws a <code>NoSuchAttractDetailFormInfoException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attract detail form info
	 * @throws NoSuchAttractDetailFormInfoException if a matching attract detail form info could not be found
	 */
	public AttractDetailFormInfo findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractDetailFormInfoException;

	/**
	 * Returns the attract detail form info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attract detail form info, or <code>null</code> if a matching attract detail form info could not be found
	 */
	public AttractDetailFormInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the attract detail form info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attract detail form info, or <code>null</code> if a matching attract detail form info could not be found
	 */
	public AttractDetailFormInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the attract detail form info where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attract detail form info that was removed
	 */
	public AttractDetailFormInfo removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractDetailFormInfoException;

	/**
	 * Returns the number of attract detail form infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attract detail form infos
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the attract detail form info in the entity cache if it is enabled.
	 *
	 * @param attractDetailFormInfo the attract detail form info
	 */
	public void cacheResult(AttractDetailFormInfo attractDetailFormInfo);

	/**
	 * Caches the attract detail form infos in the entity cache if it is enabled.
	 *
	 * @param attractDetailFormInfos the attract detail form infos
	 */
	public void cacheResult(
		java.util.List<AttractDetailFormInfo> attractDetailFormInfos);

	/**
	 * Creates a new attract detail form info with the primary key. Does not add the attract detail form info to the database.
	 *
	 * @param attractDetailFormInfoId the primary key for the new attract detail form info
	 * @return the new attract detail form info
	 */
	public AttractDetailFormInfo create(long attractDetailFormInfoId);

	/**
	 * Removes the attract detail form info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractDetailFormInfoId the primary key of the attract detail form info
	 * @return the attract detail form info that was removed
	 * @throws NoSuchAttractDetailFormInfoException if a attract detail form info with the primary key could not be found
	 */
	public AttractDetailFormInfo remove(long attractDetailFormInfoId)
		throws NoSuchAttractDetailFormInfoException;

	public AttractDetailFormInfo updateImpl(
		AttractDetailFormInfo attractDetailFormInfo);

	/**
	 * Returns the attract detail form info with the primary key or throws a <code>NoSuchAttractDetailFormInfoException</code> if it could not be found.
	 *
	 * @param attractDetailFormInfoId the primary key of the attract detail form info
	 * @return the attract detail form info
	 * @throws NoSuchAttractDetailFormInfoException if a attract detail form info with the primary key could not be found
	 */
	public AttractDetailFormInfo findByPrimaryKey(long attractDetailFormInfoId)
		throws NoSuchAttractDetailFormInfoException;

	/**
	 * Returns the attract detail form info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractDetailFormInfoId the primary key of the attract detail form info
	 * @return the attract detail form info, or <code>null</code> if a attract detail form info with the primary key could not be found
	 */
	public AttractDetailFormInfo fetchByPrimaryKey(
		long attractDetailFormInfoId);

	/**
	 * Returns all the attract detail form infos.
	 *
	 * @return the attract detail form infos
	 */
	public java.util.List<AttractDetailFormInfo> findAll();

	/**
	 * Returns a range of all the attract detail form infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractDetailFormInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attract detail form infos
	 * @param end the upper bound of the range of attract detail form infos (not inclusive)
	 * @return the range of attract detail form infos
	 */
	public java.util.List<AttractDetailFormInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the attract detail form infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractDetailFormInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attract detail form infos
	 * @param end the upper bound of the range of attract detail form infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attract detail form infos
	 */
	public java.util.List<AttractDetailFormInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AttractDetailFormInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the attract detail form infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractDetailFormInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attract detail form infos
	 * @param end the upper bound of the range of attract detail form infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attract detail form infos
	 */
	public java.util.List<AttractDetailFormInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AttractDetailFormInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the attract detail form infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of attract detail form infos.
	 *
	 * @return the number of attract detail form infos
	 */
	public int countAll();

}