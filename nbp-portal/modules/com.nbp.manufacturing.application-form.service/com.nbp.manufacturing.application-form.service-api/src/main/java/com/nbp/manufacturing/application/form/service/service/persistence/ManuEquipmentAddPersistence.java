/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuEquipmentAddException;
import com.nbp.manufacturing.application.form.service.model.ManuEquipmentAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the manu equipment add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuEquipmentAddUtil
 * @generated
 */
@ProviderType
public interface ManuEquipmentAddPersistence
	extends BasePersistence<ManuEquipmentAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManuEquipmentAddUtil} to access the manu equipment add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the manu equipment adds where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu equipment adds
	 */
	public java.util.List<ManuEquipmentAdd> findBygetMA_EAF(
		long manufacturingApplicationId);

	/**
	 * Returns a range of all the manu equipment adds where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @return the range of matching manu equipment adds
	 */
	public java.util.List<ManuEquipmentAdd> findBygetMA_EAF(
		long manufacturingApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the manu equipment adds where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu equipment adds
	 */
	public java.util.List<ManuEquipmentAdd> findBygetMA_EAF(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuEquipmentAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu equipment adds where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu equipment adds
	 */
	public java.util.List<ManuEquipmentAdd> findBygetMA_EAF(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuEquipmentAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first manu equipment add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a matching manu equipment add could not be found
	 */
	public ManuEquipmentAdd findBygetMA_EAF_First(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuEquipmentAdd>
				orderByComparator)
		throws NoSuchManuEquipmentAddException;

	/**
	 * Returns the first manu equipment add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment add, or <code>null</code> if a matching manu equipment add could not be found
	 */
	public ManuEquipmentAdd fetchBygetMA_EAF_First(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuEquipmentAdd>
			orderByComparator);

	/**
	 * Returns the last manu equipment add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a matching manu equipment add could not be found
	 */
	public ManuEquipmentAdd findBygetMA_EAF_Last(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuEquipmentAdd>
				orderByComparator)
		throws NoSuchManuEquipmentAddException;

	/**
	 * Returns the last manu equipment add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment add, or <code>null</code> if a matching manu equipment add could not be found
	 */
	public ManuEquipmentAdd fetchBygetMA_EAF_Last(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuEquipmentAdd>
			orderByComparator);

	/**
	 * Returns the manu equipment adds before and after the current manu equipment add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuEquipmentAddId the primary key of the current manu equipment add
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a manu equipment add with the primary key could not be found
	 */
	public ManuEquipmentAdd[] findBygetMA_EAF_PrevAndNext(
			long manuEquipmentAddId, long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuEquipmentAdd>
				orderByComparator)
		throws NoSuchManuEquipmentAddException;

	/**
	 * Removes all the manu equipment adds where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public void removeBygetMA_EAF(long manufacturingApplicationId);

	/**
	 * Returns the number of manu equipment adds where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu equipment adds
	 */
	public int countBygetMA_EAF(long manufacturingApplicationId);

	/**
	 * Returns all the manu equipment adds where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @return the matching manu equipment adds
	 */
	public java.util.List<ManuEquipmentAdd> findBygetMA_EAI(
		long manuEquipmentId);

	/**
	 * Returns a range of all the manu equipment adds where manuEquipmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @return the range of matching manu equipment adds
	 */
	public java.util.List<ManuEquipmentAdd> findBygetMA_EAI(
		long manuEquipmentId, int start, int end);

	/**
	 * Returns an ordered range of all the manu equipment adds where manuEquipmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu equipment adds
	 */
	public java.util.List<ManuEquipmentAdd> findBygetMA_EAI(
		long manuEquipmentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuEquipmentAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu equipment adds where manuEquipmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu equipment adds
	 */
	public java.util.List<ManuEquipmentAdd> findBygetMA_EAI(
		long manuEquipmentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuEquipmentAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first manu equipment add in the ordered set where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a matching manu equipment add could not be found
	 */
	public ManuEquipmentAdd findBygetMA_EAI_First(
			long manuEquipmentId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuEquipmentAdd>
				orderByComparator)
		throws NoSuchManuEquipmentAddException;

	/**
	 * Returns the first manu equipment add in the ordered set where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment add, or <code>null</code> if a matching manu equipment add could not be found
	 */
	public ManuEquipmentAdd fetchBygetMA_EAI_First(
		long manuEquipmentId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuEquipmentAdd>
			orderByComparator);

	/**
	 * Returns the last manu equipment add in the ordered set where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a matching manu equipment add could not be found
	 */
	public ManuEquipmentAdd findBygetMA_EAI_Last(
			long manuEquipmentId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuEquipmentAdd>
				orderByComparator)
		throws NoSuchManuEquipmentAddException;

	/**
	 * Returns the last manu equipment add in the ordered set where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment add, or <code>null</code> if a matching manu equipment add could not be found
	 */
	public ManuEquipmentAdd fetchBygetMA_EAI_Last(
		long manuEquipmentId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuEquipmentAdd>
			orderByComparator);

	/**
	 * Returns the manu equipment adds before and after the current manu equipment add in the ordered set where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentAddId the primary key of the current manu equipment add
	 * @param manuEquipmentId the manu equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a manu equipment add with the primary key could not be found
	 */
	public ManuEquipmentAdd[] findBygetMA_EAI_PrevAndNext(
			long manuEquipmentAddId, long manuEquipmentId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuEquipmentAdd>
				orderByComparator)
		throws NoSuchManuEquipmentAddException;

	/**
	 * Removes all the manu equipment adds where manuEquipmentId = &#63; from the database.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 */
	public void removeBygetMA_EAI(long manuEquipmentId);

	/**
	 * Returns the number of manu equipment adds where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @return the number of matching manu equipment adds
	 */
	public int countBygetMA_EAI(long manuEquipmentId);

	/**
	 * Caches the manu equipment add in the entity cache if it is enabled.
	 *
	 * @param manuEquipmentAdd the manu equipment add
	 */
	public void cacheResult(ManuEquipmentAdd manuEquipmentAdd);

	/**
	 * Caches the manu equipment adds in the entity cache if it is enabled.
	 *
	 * @param manuEquipmentAdds the manu equipment adds
	 */
	public void cacheResult(java.util.List<ManuEquipmentAdd> manuEquipmentAdds);

	/**
	 * Creates a new manu equipment add with the primary key. Does not add the manu equipment add to the database.
	 *
	 * @param manuEquipmentAddId the primary key for the new manu equipment add
	 * @return the new manu equipment add
	 */
	public ManuEquipmentAdd create(long manuEquipmentAddId);

	/**
	 * Removes the manu equipment add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuEquipmentAddId the primary key of the manu equipment add
	 * @return the manu equipment add that was removed
	 * @throws NoSuchManuEquipmentAddException if a manu equipment add with the primary key could not be found
	 */
	public ManuEquipmentAdd remove(long manuEquipmentAddId)
		throws NoSuchManuEquipmentAddException;

	public ManuEquipmentAdd updateImpl(ManuEquipmentAdd manuEquipmentAdd);

	/**
	 * Returns the manu equipment add with the primary key or throws a <code>NoSuchManuEquipmentAddException</code> if it could not be found.
	 *
	 * @param manuEquipmentAddId the primary key of the manu equipment add
	 * @return the manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a manu equipment add with the primary key could not be found
	 */
	public ManuEquipmentAdd findByPrimaryKey(long manuEquipmentAddId)
		throws NoSuchManuEquipmentAddException;

	/**
	 * Returns the manu equipment add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuEquipmentAddId the primary key of the manu equipment add
	 * @return the manu equipment add, or <code>null</code> if a manu equipment add with the primary key could not be found
	 */
	public ManuEquipmentAdd fetchByPrimaryKey(long manuEquipmentAddId);

	/**
	 * Returns all the manu equipment adds.
	 *
	 * @return the manu equipment adds
	 */
	public java.util.List<ManuEquipmentAdd> findAll();

	/**
	 * Returns a range of all the manu equipment adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @return the range of manu equipment adds
	 */
	public java.util.List<ManuEquipmentAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the manu equipment adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu equipment adds
	 */
	public java.util.List<ManuEquipmentAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuEquipmentAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu equipment adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu equipment adds
	 */
	public java.util.List<ManuEquipmentAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuEquipmentAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the manu equipment adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of manu equipment adds.
	 *
	 * @return the number of manu equipment adds
	 */
	public int countAll();

}