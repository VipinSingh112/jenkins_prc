/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantEmploymentInfoException;
import com.nbp.sez.status.application.form.service.model.SezOccupantEmploymentInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez occupant employment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantEmploymentInfoUtil
 * @generated
 */
@ProviderType
public interface SezOccupantEmploymentInfoPersistence
	extends BasePersistence<SezOccupantEmploymentInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezOccupantEmploymentInfoUtil} to access the sez occupant employment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez occupant employment info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantEmploymentInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant employment info
	 * @throws NoSuchSezOccupantEmploymentInfoException if a matching sez occupant employment info could not be found
	 */
	public SezOccupantEmploymentInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantEmploymentInfoException;

	/**
	 * Returns the sez occupant employment info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant employment info, or <code>null</code> if a matching sez occupant employment info could not be found
	 */
	public SezOccupantEmploymentInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez occupant employment info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant employment info, or <code>null</code> if a matching sez occupant employment info could not be found
	 */
	public SezOccupantEmploymentInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez occupant employment info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant employment info that was removed
	 */
	public SezOccupantEmploymentInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantEmploymentInfoException;

	/**
	 * Returns the number of sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant employment infos
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns all the sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant employment infos
	 */
	public java.util.List<SezOccupantEmploymentInfo>
		findBygetSezStatusByApplicationId(long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @return the range of matching sez occupant employment infos
	 */
	public java.util.List<SezOccupantEmploymentInfo>
		findBygetSezStatusByApplicationId(
			long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occupant employment infos
	 */
	public java.util.List<SezOccupantEmploymentInfo>
		findBygetSezStatusByApplicationId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezOccupantEmploymentInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occupant employment infos
	 */
	public java.util.List<SezOccupantEmploymentInfo>
		findBygetSezStatusByApplicationId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezOccupantEmploymentInfo> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first sez occupant employment info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant employment info
	 * @throws NoSuchSezOccupantEmploymentInfoException if a matching sez occupant employment info could not be found
	 */
	public SezOccupantEmploymentInfo findBygetSezStatusByApplicationId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezOccupantEmploymentInfo> orderByComparator)
		throws NoSuchSezOccupantEmploymentInfoException;

	/**
	 * Returns the first sez occupant employment info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant employment info, or <code>null</code> if a matching sez occupant employment info could not be found
	 */
	public SezOccupantEmploymentInfo fetchBygetSezStatusByApplicationId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantEmploymentInfo> orderByComparator);

	/**
	 * Returns the last sez occupant employment info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant employment info
	 * @throws NoSuchSezOccupantEmploymentInfoException if a matching sez occupant employment info could not be found
	 */
	public SezOccupantEmploymentInfo findBygetSezStatusByApplicationId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezOccupantEmploymentInfo> orderByComparator)
		throws NoSuchSezOccupantEmploymentInfoException;

	/**
	 * Returns the last sez occupant employment info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant employment info, or <code>null</code> if a matching sez occupant employment info could not be found
	 */
	public SezOccupantEmploymentInfo fetchBygetSezStatusByApplicationId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantEmploymentInfo> orderByComparator);

	/**
	 * Returns the sez occupant employment infos before and after the current sez occupant employment info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccEmpId the primary key of the current sez occupant employment info
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occupant employment info
	 * @throws NoSuchSezOccupantEmploymentInfoException if a sez occupant employment info with the primary key could not be found
	 */
	public SezOccupantEmploymentInfo[]
			findBygetSezStatusByApplicationId_PrevAndNext(
				long sezOccEmpId, long sezStatusApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<SezOccupantEmploymentInfo> orderByComparator)
		throws NoSuchSezOccupantEmploymentInfoException;

	/**
	 * Removes all the sez occupant employment infos where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusByApplicationId(
		long sezStatusApplicationId);

	/**
	 * Returns the number of sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant employment infos
	 */
	public int countBygetSezStatusByApplicationId(long sezStatusApplicationId);

	/**
	 * Caches the sez occupant employment info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantEmploymentInfo the sez occupant employment info
	 */
	public void cacheResult(
		SezOccupantEmploymentInfo sezOccupantEmploymentInfo);

	/**
	 * Caches the sez occupant employment infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantEmploymentInfos the sez occupant employment infos
	 */
	public void cacheResult(
		java.util.List<SezOccupantEmploymentInfo> sezOccupantEmploymentInfos);

	/**
	 * Creates a new sez occupant employment info with the primary key. Does not add the sez occupant employment info to the database.
	 *
	 * @param sezOccEmpId the primary key for the new sez occupant employment info
	 * @return the new sez occupant employment info
	 */
	public SezOccupantEmploymentInfo create(long sezOccEmpId);

	/**
	 * Removes the sez occupant employment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccEmpId the primary key of the sez occupant employment info
	 * @return the sez occupant employment info that was removed
	 * @throws NoSuchSezOccupantEmploymentInfoException if a sez occupant employment info with the primary key could not be found
	 */
	public SezOccupantEmploymentInfo remove(long sezOccEmpId)
		throws NoSuchSezOccupantEmploymentInfoException;

	public SezOccupantEmploymentInfo updateImpl(
		SezOccupantEmploymentInfo sezOccupantEmploymentInfo);

	/**
	 * Returns the sez occupant employment info with the primary key or throws a <code>NoSuchSezOccupantEmploymentInfoException</code> if it could not be found.
	 *
	 * @param sezOccEmpId the primary key of the sez occupant employment info
	 * @return the sez occupant employment info
	 * @throws NoSuchSezOccupantEmploymentInfoException if a sez occupant employment info with the primary key could not be found
	 */
	public SezOccupantEmploymentInfo findByPrimaryKey(long sezOccEmpId)
		throws NoSuchSezOccupantEmploymentInfoException;

	/**
	 * Returns the sez occupant employment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccEmpId the primary key of the sez occupant employment info
	 * @return the sez occupant employment info, or <code>null</code> if a sez occupant employment info with the primary key could not be found
	 */
	public SezOccupantEmploymentInfo fetchByPrimaryKey(long sezOccEmpId);

	/**
	 * Returns all the sez occupant employment infos.
	 *
	 * @return the sez occupant employment infos
	 */
	public java.util.List<SezOccupantEmploymentInfo> findAll();

	/**
	 * Returns a range of all the sez occupant employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @return the range of sez occupant employment infos
	 */
	public java.util.List<SezOccupantEmploymentInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez occupant employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant employment infos
	 */
	public java.util.List<SezOccupantEmploymentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantEmploymentInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the sez occupant employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant employment infos
	 */
	public java.util.List<SezOccupantEmploymentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantEmploymentInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez occupant employment infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez occupant employment infos.
	 *
	 * @return the number of sez occupant employment infos
	 */
	public int countAll();

}