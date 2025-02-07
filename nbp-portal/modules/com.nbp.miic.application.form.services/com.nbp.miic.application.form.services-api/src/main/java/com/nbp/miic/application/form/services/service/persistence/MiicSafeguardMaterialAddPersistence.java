/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.miic.application.form.services.exception.NoSuchMiicSafeguardMaterialAddException;
import com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the miic safeguard material add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicSafeguardMaterialAddUtil
 * @generated
 */
@ProviderType
public interface MiicSafeguardMaterialAddPersistence
	extends BasePersistence<MiicSafeguardMaterialAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiicSafeguardMaterialAddUtil} to access the miic safeguard material add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the miic safeguard material adds where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic safeguard material adds
	 */
	public java.util.List<MiicSafeguardMaterialAdd> findBygetMiicById(
		long miicApplicationId);

	/**
	 * Returns a range of all the miic safeguard material adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardMaterialAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic safeguard material adds
	 * @param end the upper bound of the range of miic safeguard material adds (not inclusive)
	 * @return the range of matching miic safeguard material adds
	 */
	public java.util.List<MiicSafeguardMaterialAdd> findBygetMiicById(
		long miicApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the miic safeguard material adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardMaterialAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic safeguard material adds
	 * @param end the upper bound of the range of miic safeguard material adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic safeguard material adds
	 */
	public java.util.List<MiicSafeguardMaterialAdd> findBygetMiicById(
		long miicApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiicSafeguardMaterialAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the miic safeguard material adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardMaterialAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic safeguard material adds
	 * @param end the upper bound of the range of miic safeguard material adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic safeguard material adds
	 */
	public java.util.List<MiicSafeguardMaterialAdd> findBygetMiicById(
		long miicApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiicSafeguardMaterialAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first miic safeguard material add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic safeguard material add
	 * @throws NoSuchMiicSafeguardMaterialAddException if a matching miic safeguard material add could not be found
	 */
	public MiicSafeguardMaterialAdd findBygetMiicById_First(
			long miicApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicSafeguardMaterialAdd> orderByComparator)
		throws NoSuchMiicSafeguardMaterialAddException;

	/**
	 * Returns the first miic safeguard material add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic safeguard material add, or <code>null</code> if a matching miic safeguard material add could not be found
	 */
	public MiicSafeguardMaterialAdd fetchBygetMiicById_First(
		long miicApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiicSafeguardMaterialAdd> orderByComparator);

	/**
	 * Returns the last miic safeguard material add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic safeguard material add
	 * @throws NoSuchMiicSafeguardMaterialAddException if a matching miic safeguard material add could not be found
	 */
	public MiicSafeguardMaterialAdd findBygetMiicById_Last(
			long miicApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicSafeguardMaterialAdd> orderByComparator)
		throws NoSuchMiicSafeguardMaterialAddException;

	/**
	 * Returns the last miic safeguard material add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic safeguard material add, or <code>null</code> if a matching miic safeguard material add could not be found
	 */
	public MiicSafeguardMaterialAdd fetchBygetMiicById_Last(
		long miicApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiicSafeguardMaterialAdd> orderByComparator);

	/**
	 * Returns the miic safeguard material adds before and after the current miic safeguard material add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicSafeguardMaterialAddId the primary key of the current miic safeguard material add
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic safeguard material add
	 * @throws NoSuchMiicSafeguardMaterialAddException if a miic safeguard material add with the primary key could not be found
	 */
	public MiicSafeguardMaterialAdd[] findBygetMiicById_PrevAndNext(
			long miicSafeguardMaterialAddId, long miicApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicSafeguardMaterialAdd> orderByComparator)
		throws NoSuchMiicSafeguardMaterialAddException;

	/**
	 * Removes all the miic safeguard material adds where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 */
	public void removeBygetMiicById(long miicApplicationId);

	/**
	 * Returns the number of miic safeguard material adds where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic safeguard material adds
	 */
	public int countBygetMiicById(long miicApplicationId);

	/**
	 * Caches the miic safeguard material add in the entity cache if it is enabled.
	 *
	 * @param miicSafeguardMaterialAdd the miic safeguard material add
	 */
	public void cacheResult(MiicSafeguardMaterialAdd miicSafeguardMaterialAdd);

	/**
	 * Caches the miic safeguard material adds in the entity cache if it is enabled.
	 *
	 * @param miicSafeguardMaterialAdds the miic safeguard material adds
	 */
	public void cacheResult(
		java.util.List<MiicSafeguardMaterialAdd> miicSafeguardMaterialAdds);

	/**
	 * Creates a new miic safeguard material add with the primary key. Does not add the miic safeguard material add to the database.
	 *
	 * @param miicSafeguardMaterialAddId the primary key for the new miic safeguard material add
	 * @return the new miic safeguard material add
	 */
	public MiicSafeguardMaterialAdd create(long miicSafeguardMaterialAddId);

	/**
	 * Removes the miic safeguard material add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicSafeguardMaterialAddId the primary key of the miic safeguard material add
	 * @return the miic safeguard material add that was removed
	 * @throws NoSuchMiicSafeguardMaterialAddException if a miic safeguard material add with the primary key could not be found
	 */
	public MiicSafeguardMaterialAdd remove(long miicSafeguardMaterialAddId)
		throws NoSuchMiicSafeguardMaterialAddException;

	public MiicSafeguardMaterialAdd updateImpl(
		MiicSafeguardMaterialAdd miicSafeguardMaterialAdd);

	/**
	 * Returns the miic safeguard material add with the primary key or throws a <code>NoSuchMiicSafeguardMaterialAddException</code> if it could not be found.
	 *
	 * @param miicSafeguardMaterialAddId the primary key of the miic safeguard material add
	 * @return the miic safeguard material add
	 * @throws NoSuchMiicSafeguardMaterialAddException if a miic safeguard material add with the primary key could not be found
	 */
	public MiicSafeguardMaterialAdd findByPrimaryKey(
			long miicSafeguardMaterialAddId)
		throws NoSuchMiicSafeguardMaterialAddException;

	/**
	 * Returns the miic safeguard material add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicSafeguardMaterialAddId the primary key of the miic safeguard material add
	 * @return the miic safeguard material add, or <code>null</code> if a miic safeguard material add with the primary key could not be found
	 */
	public MiicSafeguardMaterialAdd fetchByPrimaryKey(
		long miicSafeguardMaterialAddId);

	/**
	 * Returns all the miic safeguard material adds.
	 *
	 * @return the miic safeguard material adds
	 */
	public java.util.List<MiicSafeguardMaterialAdd> findAll();

	/**
	 * Returns a range of all the miic safeguard material adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardMaterialAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard material adds
	 * @param end the upper bound of the range of miic safeguard material adds (not inclusive)
	 * @return the range of miic safeguard material adds
	 */
	public java.util.List<MiicSafeguardMaterialAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the miic safeguard material adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardMaterialAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard material adds
	 * @param end the upper bound of the range of miic safeguard material adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic safeguard material adds
	 */
	public java.util.List<MiicSafeguardMaterialAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiicSafeguardMaterialAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the miic safeguard material adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardMaterialAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard material adds
	 * @param end the upper bound of the range of miic safeguard material adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic safeguard material adds
	 */
	public java.util.List<MiicSafeguardMaterialAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiicSafeguardMaterialAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the miic safeguard material adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of miic safeguard material adds.
	 *
	 * @return the number of miic safeguard material adds
	 */
	public int countAll();

}