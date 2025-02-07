/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuEquipmentException;
import com.nbp.manufacturing.application.form.service.model.ManuEquipment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the manu equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuEquipmentUtil
 * @generated
 */
@ProviderType
public interface ManuEquipmentPersistence
	extends BasePersistence<ManuEquipment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManuEquipmentUtil} to access the manu equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the manu equipment where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuEquipmentException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu equipment
	 * @throws NoSuchManuEquipmentException if a matching manu equipment could not be found
	 */
	public ManuEquipment findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuEquipmentException;

	/**
	 * Returns the manu equipment where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu equipment, or <code>null</code> if a matching manu equipment could not be found
	 */
	public ManuEquipment fetchBygetManufactureById(
		long manufacturingApplicationId);

	/**
	 * Returns the manu equipment where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu equipment, or <code>null</code> if a matching manu equipment could not be found
	 */
	public ManuEquipment fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache);

	/**
	 * Removes the manu equipment where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu equipment that was removed
	 */
	public ManuEquipment removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuEquipmentException;

	/**
	 * Returns the number of manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu equipments
	 */
	public int countBygetManufactureById(long manufacturingApplicationId);

	/**
	 * Returns all the manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu equipments
	 */
	public java.util.List<ManuEquipment> findBygetMA_ME_MAI(
		long manufacturingApplicationId);

	/**
	 * Returns a range of all the manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @return the range of matching manu equipments
	 */
	public java.util.List<ManuEquipment> findBygetMA_ME_MAI(
		long manufacturingApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu equipments
	 */
	public java.util.List<ManuEquipment> findBygetMA_ME_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuEquipment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu equipments
	 */
	public java.util.List<ManuEquipment> findBygetMA_ME_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuEquipment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first manu equipment in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment
	 * @throws NoSuchManuEquipmentException if a matching manu equipment could not be found
	 */
	public ManuEquipment findBygetMA_ME_MAI_First(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuEquipment>
				orderByComparator)
		throws NoSuchManuEquipmentException;

	/**
	 * Returns the first manu equipment in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment, or <code>null</code> if a matching manu equipment could not be found
	 */
	public ManuEquipment fetchBygetMA_ME_MAI_First(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuEquipment>
			orderByComparator);

	/**
	 * Returns the last manu equipment in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment
	 * @throws NoSuchManuEquipmentException if a matching manu equipment could not be found
	 */
	public ManuEquipment findBygetMA_ME_MAI_Last(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuEquipment>
				orderByComparator)
		throws NoSuchManuEquipmentException;

	/**
	 * Returns the last manu equipment in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment, or <code>null</code> if a matching manu equipment could not be found
	 */
	public ManuEquipment fetchBygetMA_ME_MAI_Last(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuEquipment>
			orderByComparator);

	/**
	 * Returns the manu equipments before and after the current manu equipment in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuEquipmentId the primary key of the current manu equipment
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu equipment
	 * @throws NoSuchManuEquipmentException if a manu equipment with the primary key could not be found
	 */
	public ManuEquipment[] findBygetMA_ME_MAI_PrevAndNext(
			long manuEquipmentId, long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuEquipment>
				orderByComparator)
		throws NoSuchManuEquipmentException;

	/**
	 * Removes all the manu equipments where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public void removeBygetMA_ME_MAI(long manufacturingApplicationId);

	/**
	 * Returns the number of manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu equipments
	 */
	public int countBygetMA_ME_MAI(long manufacturingApplicationId);

	/**
	 * Caches the manu equipment in the entity cache if it is enabled.
	 *
	 * @param manuEquipment the manu equipment
	 */
	public void cacheResult(ManuEquipment manuEquipment);

	/**
	 * Caches the manu equipments in the entity cache if it is enabled.
	 *
	 * @param manuEquipments the manu equipments
	 */
	public void cacheResult(java.util.List<ManuEquipment> manuEquipments);

	/**
	 * Creates a new manu equipment with the primary key. Does not add the manu equipment to the database.
	 *
	 * @param manuEquipmentId the primary key for the new manu equipment
	 * @return the new manu equipment
	 */
	public ManuEquipment create(long manuEquipmentId);

	/**
	 * Removes the manu equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuEquipmentId the primary key of the manu equipment
	 * @return the manu equipment that was removed
	 * @throws NoSuchManuEquipmentException if a manu equipment with the primary key could not be found
	 */
	public ManuEquipment remove(long manuEquipmentId)
		throws NoSuchManuEquipmentException;

	public ManuEquipment updateImpl(ManuEquipment manuEquipment);

	/**
	 * Returns the manu equipment with the primary key or throws a <code>NoSuchManuEquipmentException</code> if it could not be found.
	 *
	 * @param manuEquipmentId the primary key of the manu equipment
	 * @return the manu equipment
	 * @throws NoSuchManuEquipmentException if a manu equipment with the primary key could not be found
	 */
	public ManuEquipment findByPrimaryKey(long manuEquipmentId)
		throws NoSuchManuEquipmentException;

	/**
	 * Returns the manu equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuEquipmentId the primary key of the manu equipment
	 * @return the manu equipment, or <code>null</code> if a manu equipment with the primary key could not be found
	 */
	public ManuEquipment fetchByPrimaryKey(long manuEquipmentId);

	/**
	 * Returns all the manu equipments.
	 *
	 * @return the manu equipments
	 */
	public java.util.List<ManuEquipment> findAll();

	/**
	 * Returns a range of all the manu equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @return the range of manu equipments
	 */
	public java.util.List<ManuEquipment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the manu equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu equipments
	 */
	public java.util.List<ManuEquipment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuEquipment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu equipments
	 */
	public java.util.List<ManuEquipment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuEquipment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the manu equipments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of manu equipments.
	 *
	 * @return the number of manu equipments
	 */
	public int countAll();

}