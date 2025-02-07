/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneEmployInfoException;
import com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez zone employ info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneEmployInfoUtil
 * @generated
 */
@ProviderType
public interface SezZoneEmployInfoPersistence
	extends BasePersistence<SezZoneEmployInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezZoneEmployInfoUtil} to access the sez zone employ info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez zone employ infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone employ infos
	 */
	public java.util.List<SezZoneEmployInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez zone employ infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @return the range of matching sez zone employ infos
	 */
	public java.util.List<SezZoneEmployInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez zone employ infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez zone employ infos
	 */
	public java.util.List<SezZoneEmployInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmployInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez zone employ infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez zone employ infos
	 */
	public java.util.List<SezZoneEmployInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmployInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez zone employ info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone employ info
	 * @throws NoSuchSezZoneEmployInfoException if a matching sez zone employ info could not be found
	 */
	public SezZoneEmployInfo findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmployInfo>
				orderByComparator)
		throws NoSuchSezZoneEmployInfoException;

	/**
	 * Returns the first sez zone employ info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone employ info, or <code>null</code> if a matching sez zone employ info could not be found
	 */
	public SezZoneEmployInfo fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmployInfo>
			orderByComparator);

	/**
	 * Returns the last sez zone employ info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone employ info
	 * @throws NoSuchSezZoneEmployInfoException if a matching sez zone employ info could not be found
	 */
	public SezZoneEmployInfo findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmployInfo>
				orderByComparator)
		throws NoSuchSezZoneEmployInfoException;

	/**
	 * Returns the last sez zone employ info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone employ info, or <code>null</code> if a matching sez zone employ info could not be found
	 */
	public SezZoneEmployInfo fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmployInfo>
			orderByComparator);

	/**
	 * Returns the sez zone employ infos before and after the current sez zone employ info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezZoneEmpInfoId the primary key of the current sez zone employ info
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez zone employ info
	 * @throws NoSuchSezZoneEmployInfoException if a sez zone employ info with the primary key could not be found
	 */
	public SezZoneEmployInfo[] findBygetSezStatusByAppId_PrevAndNext(
			long sezZoneEmpInfoId, long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmployInfo>
				orderByComparator)
		throws NoSuchSezZoneEmployInfoException;

	/**
	 * Removes all the sez zone employ infos where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the number of sez zone employ infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone employ infos
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez zone employ info in the entity cache if it is enabled.
	 *
	 * @param sezZoneEmployInfo the sez zone employ info
	 */
	public void cacheResult(SezZoneEmployInfo sezZoneEmployInfo);

	/**
	 * Caches the sez zone employ infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneEmployInfos the sez zone employ infos
	 */
	public void cacheResult(
		java.util.List<SezZoneEmployInfo> sezZoneEmployInfos);

	/**
	 * Creates a new sez zone employ info with the primary key. Does not add the sez zone employ info to the database.
	 *
	 * @param sezZoneEmpInfoId the primary key for the new sez zone employ info
	 * @return the new sez zone employ info
	 */
	public SezZoneEmployInfo create(long sezZoneEmpInfoId);

	/**
	 * Removes the sez zone employ info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone employ info
	 * @return the sez zone employ info that was removed
	 * @throws NoSuchSezZoneEmployInfoException if a sez zone employ info with the primary key could not be found
	 */
	public SezZoneEmployInfo remove(long sezZoneEmpInfoId)
		throws NoSuchSezZoneEmployInfoException;

	public SezZoneEmployInfo updateImpl(SezZoneEmployInfo sezZoneEmployInfo);

	/**
	 * Returns the sez zone employ info with the primary key or throws a <code>NoSuchSezZoneEmployInfoException</code> if it could not be found.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone employ info
	 * @return the sez zone employ info
	 * @throws NoSuchSezZoneEmployInfoException if a sez zone employ info with the primary key could not be found
	 */
	public SezZoneEmployInfo findByPrimaryKey(long sezZoneEmpInfoId)
		throws NoSuchSezZoneEmployInfoException;

	/**
	 * Returns the sez zone employ info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone employ info
	 * @return the sez zone employ info, or <code>null</code> if a sez zone employ info with the primary key could not be found
	 */
	public SezZoneEmployInfo fetchByPrimaryKey(long sezZoneEmpInfoId);

	/**
	 * Returns all the sez zone employ infos.
	 *
	 * @return the sez zone employ infos
	 */
	public java.util.List<SezZoneEmployInfo> findAll();

	/**
	 * Returns a range of all the sez zone employ infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @return the range of sez zone employ infos
	 */
	public java.util.List<SezZoneEmployInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez zone employ infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone employ infos
	 */
	public java.util.List<SezZoneEmployInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmployInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez zone employ infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone employ infos
	 */
	public java.util.List<SezZoneEmployInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmployInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez zone employ infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez zone employ infos.
	 *
	 * @return the number of sez zone employ infos
	 */
	public int countAll();

}