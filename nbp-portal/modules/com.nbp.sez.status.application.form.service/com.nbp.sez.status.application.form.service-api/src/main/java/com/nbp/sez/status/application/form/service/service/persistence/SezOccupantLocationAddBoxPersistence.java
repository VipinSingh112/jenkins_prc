/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantLocationAddBoxException;
import com.nbp.sez.status.application.form.service.model.SezOccupantLocationAddBox;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez occupant location add box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantLocationAddBoxUtil
 * @generated
 */
@ProviderType
public interface SezOccupantLocationAddBoxPersistence
	extends BasePersistence<SezOccupantLocationAddBox> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezOccupantLocationAddBoxUtil} to access the sez occupant location add box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez occupant location add boxes where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant location add boxes
	 */
	public java.util.List<SezOccupantLocationAddBox> findBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez occupant location add boxes where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @return the range of matching sez occupant location add boxes
	 */
	public java.util.List<SezOccupantLocationAddBox> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez occupant location add boxes where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occupant location add boxes
	 */
	public java.util.List<SezOccupantLocationAddBox> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantLocationAddBox> orderByComparator);

	/**
	 * Returns an ordered range of all the sez occupant location add boxes where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occupant location add boxes
	 */
	public java.util.List<SezOccupantLocationAddBox> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantLocationAddBox> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez occupant location add box in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant location add box
	 * @throws NoSuchSezOccupantLocationAddBoxException if a matching sez occupant location add box could not be found
	 */
	public SezOccupantLocationAddBox findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezOccupantLocationAddBox> orderByComparator)
		throws NoSuchSezOccupantLocationAddBoxException;

	/**
	 * Returns the first sez occupant location add box in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant location add box, or <code>null</code> if a matching sez occupant location add box could not be found
	 */
	public SezOccupantLocationAddBox fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantLocationAddBox> orderByComparator);

	/**
	 * Returns the last sez occupant location add box in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant location add box
	 * @throws NoSuchSezOccupantLocationAddBoxException if a matching sez occupant location add box could not be found
	 */
	public SezOccupantLocationAddBox findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezOccupantLocationAddBox> orderByComparator)
		throws NoSuchSezOccupantLocationAddBoxException;

	/**
	 * Returns the last sez occupant location add box in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant location add box, or <code>null</code> if a matching sez occupant location add box could not be found
	 */
	public SezOccupantLocationAddBox fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantLocationAddBox> orderByComparator);

	/**
	 * Returns the sez occupant location add boxes before and after the current sez occupant location add box in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccLocationId the primary key of the current sez occupant location add box
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occupant location add box
	 * @throws NoSuchSezOccupantLocationAddBoxException if a sez occupant location add box with the primary key could not be found
	 */
	public SezOccupantLocationAddBox[] findBygetSezStatusByAppId_PrevAndNext(
			long sezOccLocationId, long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezOccupantLocationAddBox> orderByComparator)
		throws NoSuchSezOccupantLocationAddBoxException;

	/**
	 * Removes all the sez occupant location add boxes where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the number of sez occupant location add boxes where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant location add boxes
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez occupant location add box in the entity cache if it is enabled.
	 *
	 * @param sezOccupantLocationAddBox the sez occupant location add box
	 */
	public void cacheResult(
		SezOccupantLocationAddBox sezOccupantLocationAddBox);

	/**
	 * Caches the sez occupant location add boxes in the entity cache if it is enabled.
	 *
	 * @param sezOccupantLocationAddBoxes the sez occupant location add boxes
	 */
	public void cacheResult(
		java.util.List<SezOccupantLocationAddBox> sezOccupantLocationAddBoxes);

	/**
	 * Creates a new sez occupant location add box with the primary key. Does not add the sez occupant location add box to the database.
	 *
	 * @param sezOccLocationId the primary key for the new sez occupant location add box
	 * @return the new sez occupant location add box
	 */
	public SezOccupantLocationAddBox create(long sezOccLocationId);

	/**
	 * Removes the sez occupant location add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccLocationId the primary key of the sez occupant location add box
	 * @return the sez occupant location add box that was removed
	 * @throws NoSuchSezOccupantLocationAddBoxException if a sez occupant location add box with the primary key could not be found
	 */
	public SezOccupantLocationAddBox remove(long sezOccLocationId)
		throws NoSuchSezOccupantLocationAddBoxException;

	public SezOccupantLocationAddBox updateImpl(
		SezOccupantLocationAddBox sezOccupantLocationAddBox);

	/**
	 * Returns the sez occupant location add box with the primary key or throws a <code>NoSuchSezOccupantLocationAddBoxException</code> if it could not be found.
	 *
	 * @param sezOccLocationId the primary key of the sez occupant location add box
	 * @return the sez occupant location add box
	 * @throws NoSuchSezOccupantLocationAddBoxException if a sez occupant location add box with the primary key could not be found
	 */
	public SezOccupantLocationAddBox findByPrimaryKey(long sezOccLocationId)
		throws NoSuchSezOccupantLocationAddBoxException;

	/**
	 * Returns the sez occupant location add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccLocationId the primary key of the sez occupant location add box
	 * @return the sez occupant location add box, or <code>null</code> if a sez occupant location add box with the primary key could not be found
	 */
	public SezOccupantLocationAddBox fetchByPrimaryKey(long sezOccLocationId);

	/**
	 * Returns all the sez occupant location add boxes.
	 *
	 * @return the sez occupant location add boxes
	 */
	public java.util.List<SezOccupantLocationAddBox> findAll();

	/**
	 * Returns a range of all the sez occupant location add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @return the range of sez occupant location add boxes
	 */
	public java.util.List<SezOccupantLocationAddBox> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez occupant location add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant location add boxes
	 */
	public java.util.List<SezOccupantLocationAddBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantLocationAddBox> orderByComparator);

	/**
	 * Returns an ordered range of all the sez occupant location add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant location add boxes
	 */
	public java.util.List<SezOccupantLocationAddBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantLocationAddBox> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez occupant location add boxes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez occupant location add boxes.
	 *
	 * @return the number of sez occupant location add boxes
	 */
	public int countAll();

}