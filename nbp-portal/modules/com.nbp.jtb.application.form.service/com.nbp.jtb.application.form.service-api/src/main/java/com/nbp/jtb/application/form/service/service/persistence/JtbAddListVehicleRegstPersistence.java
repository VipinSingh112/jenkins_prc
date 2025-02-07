/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchJtbAddListVehicleRegstException;
import com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jtb add list vehicle regst service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddListVehicleRegstUtil
 * @generated
 */
@ProviderType
public interface JtbAddListVehicleRegstPersistence
	extends BasePersistence<JtbAddListVehicleRegst> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JtbAddListVehicleRegstUtil} to access the jtb add list vehicle regst persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jtb add list vehicle regsts where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add list vehicle regsts
	 */
	public java.util.List<JtbAddListVehicleRegst> findBygetByJtbAppId(
		long jtbApplicationId);

	/**
	 * Returns a range of all the jtb add list vehicle regsts where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @return the range of matching jtb add list vehicle regsts
	 */
	public java.util.List<JtbAddListVehicleRegst> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the jtb add list vehicle regsts where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb add list vehicle regsts
	 */
	public java.util.List<JtbAddListVehicleRegst> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddListVehicleRegst>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb add list vehicle regsts where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb add list vehicle regsts
	 */
	public java.util.List<JtbAddListVehicleRegst> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddListVehicleRegst>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb add list vehicle regst in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add list vehicle regst
	 * @throws NoSuchJtbAddListVehicleRegstException if a matching jtb add list vehicle regst could not be found
	 */
	public JtbAddListVehicleRegst findBygetByJtbAppId_First(
			long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAddListVehicleRegst> orderByComparator)
		throws NoSuchJtbAddListVehicleRegstException;

	/**
	 * Returns the first jtb add list vehicle regst in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add list vehicle regst, or <code>null</code> if a matching jtb add list vehicle regst could not be found
	 */
	public JtbAddListVehicleRegst fetchBygetByJtbAppId_First(
		long jtbApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddListVehicleRegst>
			orderByComparator);

	/**
	 * Returns the last jtb add list vehicle regst in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add list vehicle regst
	 * @throws NoSuchJtbAddListVehicleRegstException if a matching jtb add list vehicle regst could not be found
	 */
	public JtbAddListVehicleRegst findBygetByJtbAppId_Last(
			long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAddListVehicleRegst> orderByComparator)
		throws NoSuchJtbAddListVehicleRegstException;

	/**
	 * Returns the last jtb add list vehicle regst in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add list vehicle regst, or <code>null</code> if a matching jtb add list vehicle regst could not be found
	 */
	public JtbAddListVehicleRegst fetchBygetByJtbAppId_Last(
		long jtbApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddListVehicleRegst>
			orderByComparator);

	/**
	 * Returns the jtb add list vehicle regsts before and after the current jtb add list vehicle regst in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbAddListVehicleRegstId the primary key of the current jtb add list vehicle regst
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb add list vehicle regst
	 * @throws NoSuchJtbAddListVehicleRegstException if a jtb add list vehicle regst with the primary key could not be found
	 */
	public JtbAddListVehicleRegst[] findBygetByJtbAppId_PrevAndNext(
			long jtbAddListVehicleRegstId, long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAddListVehicleRegst> orderByComparator)
		throws NoSuchJtbAddListVehicleRegstException;

	/**
	 * Removes all the jtb add list vehicle regsts where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	public void removeBygetByJtbAppId(long jtbApplicationId);

	/**
	 * Returns the number of jtb add list vehicle regsts where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb add list vehicle regsts
	 */
	public int countBygetByJtbAppId(long jtbApplicationId);

	/**
	 * Caches the jtb add list vehicle regst in the entity cache if it is enabled.
	 *
	 * @param jtbAddListVehicleRegst the jtb add list vehicle regst
	 */
	public void cacheResult(JtbAddListVehicleRegst jtbAddListVehicleRegst);

	/**
	 * Caches the jtb add list vehicle regsts in the entity cache if it is enabled.
	 *
	 * @param jtbAddListVehicleRegsts the jtb add list vehicle regsts
	 */
	public void cacheResult(
		java.util.List<JtbAddListVehicleRegst> jtbAddListVehicleRegsts);

	/**
	 * Creates a new jtb add list vehicle regst with the primary key. Does not add the jtb add list vehicle regst to the database.
	 *
	 * @param jtbAddListVehicleRegstId the primary key for the new jtb add list vehicle regst
	 * @return the new jtb add list vehicle regst
	 */
	public JtbAddListVehicleRegst create(long jtbAddListVehicleRegstId);

	/**
	 * Removes the jtb add list vehicle regst with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbAddListVehicleRegstId the primary key of the jtb add list vehicle regst
	 * @return the jtb add list vehicle regst that was removed
	 * @throws NoSuchJtbAddListVehicleRegstException if a jtb add list vehicle regst with the primary key could not be found
	 */
	public JtbAddListVehicleRegst remove(long jtbAddListVehicleRegstId)
		throws NoSuchJtbAddListVehicleRegstException;

	public JtbAddListVehicleRegst updateImpl(
		JtbAddListVehicleRegst jtbAddListVehicleRegst);

	/**
	 * Returns the jtb add list vehicle regst with the primary key or throws a <code>NoSuchJtbAddListVehicleRegstException</code> if it could not be found.
	 *
	 * @param jtbAddListVehicleRegstId the primary key of the jtb add list vehicle regst
	 * @return the jtb add list vehicle regst
	 * @throws NoSuchJtbAddListVehicleRegstException if a jtb add list vehicle regst with the primary key could not be found
	 */
	public JtbAddListVehicleRegst findByPrimaryKey(
			long jtbAddListVehicleRegstId)
		throws NoSuchJtbAddListVehicleRegstException;

	/**
	 * Returns the jtb add list vehicle regst with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbAddListVehicleRegstId the primary key of the jtb add list vehicle regst
	 * @return the jtb add list vehicle regst, or <code>null</code> if a jtb add list vehicle regst with the primary key could not be found
	 */
	public JtbAddListVehicleRegst fetchByPrimaryKey(
		long jtbAddListVehicleRegstId);

	/**
	 * Returns all the jtb add list vehicle regsts.
	 *
	 * @return the jtb add list vehicle regsts
	 */
	public java.util.List<JtbAddListVehicleRegst> findAll();

	/**
	 * Returns a range of all the jtb add list vehicle regsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @return the range of jtb add list vehicle regsts
	 */
	public java.util.List<JtbAddListVehicleRegst> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jtb add list vehicle regsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb add list vehicle regsts
	 */
	public java.util.List<JtbAddListVehicleRegst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddListVehicleRegst>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb add list vehicle regsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb add list vehicle regsts
	 */
	public java.util.List<JtbAddListVehicleRegst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddListVehicleRegst>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jtb add list vehicle regsts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jtb add list vehicle regsts.
	 *
	 * @return the number of jtb add list vehicle regsts
	 */
	public int countAll();

}