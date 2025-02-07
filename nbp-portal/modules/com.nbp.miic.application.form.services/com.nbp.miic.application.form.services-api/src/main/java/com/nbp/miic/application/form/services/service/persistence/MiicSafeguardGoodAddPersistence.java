/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.miic.application.form.services.exception.NoSuchMiicSafeguardGoodAddException;
import com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the miic safeguard good add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicSafeguardGoodAddUtil
 * @generated
 */
@ProviderType
public interface MiicSafeguardGoodAddPersistence
	extends BasePersistence<MiicSafeguardGoodAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiicSafeguardGoodAddUtil} to access the miic safeguard good add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the miic safeguard good adds where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic safeguard good adds
	 */
	public java.util.List<MiicSafeguardGoodAdd> findBygetMiicById(
		long miicApplicationId);

	/**
	 * Returns a range of all the miic safeguard good adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @return the range of matching miic safeguard good adds
	 */
	public java.util.List<MiicSafeguardGoodAdd> findBygetMiicById(
		long miicApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the miic safeguard good adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic safeguard good adds
	 */
	public java.util.List<MiicSafeguardGoodAdd> findBygetMiicById(
		long miicApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicSafeguardGoodAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic safeguard good adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic safeguard good adds
	 */
	public java.util.List<MiicSafeguardGoodAdd> findBygetMiicById(
		long miicApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicSafeguardGoodAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first miic safeguard good add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic safeguard good add
	 * @throws NoSuchMiicSafeguardGoodAddException if a matching miic safeguard good add could not be found
	 */
	public MiicSafeguardGoodAdd findBygetMiicById_First(
			long miicApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicSafeguardGoodAdd> orderByComparator)
		throws NoSuchMiicSafeguardGoodAddException;

	/**
	 * Returns the first miic safeguard good add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic safeguard good add, or <code>null</code> if a matching miic safeguard good add could not be found
	 */
	public MiicSafeguardGoodAdd fetchBygetMiicById_First(
		long miicApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<MiicSafeguardGoodAdd>
			orderByComparator);

	/**
	 * Returns the last miic safeguard good add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic safeguard good add
	 * @throws NoSuchMiicSafeguardGoodAddException if a matching miic safeguard good add could not be found
	 */
	public MiicSafeguardGoodAdd findBygetMiicById_Last(
			long miicApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicSafeguardGoodAdd> orderByComparator)
		throws NoSuchMiicSafeguardGoodAddException;

	/**
	 * Returns the last miic safeguard good add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic safeguard good add, or <code>null</code> if a matching miic safeguard good add could not be found
	 */
	public MiicSafeguardGoodAdd fetchBygetMiicById_Last(
		long miicApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<MiicSafeguardGoodAdd>
			orderByComparator);

	/**
	 * Returns the miic safeguard good adds before and after the current miic safeguard good add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicSafeguardGoodAddId the primary key of the current miic safeguard good add
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic safeguard good add
	 * @throws NoSuchMiicSafeguardGoodAddException if a miic safeguard good add with the primary key could not be found
	 */
	public MiicSafeguardGoodAdd[] findBygetMiicById_PrevAndNext(
			long miicSafeguardGoodAddId, long miicApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicSafeguardGoodAdd> orderByComparator)
		throws NoSuchMiicSafeguardGoodAddException;

	/**
	 * Removes all the miic safeguard good adds where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 */
	public void removeBygetMiicById(long miicApplicationId);

	/**
	 * Returns the number of miic safeguard good adds where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic safeguard good adds
	 */
	public int countBygetMiicById(long miicApplicationId);

	/**
	 * Caches the miic safeguard good add in the entity cache if it is enabled.
	 *
	 * @param miicSafeguardGoodAdd the miic safeguard good add
	 */
	public void cacheResult(MiicSafeguardGoodAdd miicSafeguardGoodAdd);

	/**
	 * Caches the miic safeguard good adds in the entity cache if it is enabled.
	 *
	 * @param miicSafeguardGoodAdds the miic safeguard good adds
	 */
	public void cacheResult(
		java.util.List<MiicSafeguardGoodAdd> miicSafeguardGoodAdds);

	/**
	 * Creates a new miic safeguard good add with the primary key. Does not add the miic safeguard good add to the database.
	 *
	 * @param miicSafeguardGoodAddId the primary key for the new miic safeguard good add
	 * @return the new miic safeguard good add
	 */
	public MiicSafeguardGoodAdd create(long miicSafeguardGoodAddId);

	/**
	 * Removes the miic safeguard good add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicSafeguardGoodAddId the primary key of the miic safeguard good add
	 * @return the miic safeguard good add that was removed
	 * @throws NoSuchMiicSafeguardGoodAddException if a miic safeguard good add with the primary key could not be found
	 */
	public MiicSafeguardGoodAdd remove(long miicSafeguardGoodAddId)
		throws NoSuchMiicSafeguardGoodAddException;

	public MiicSafeguardGoodAdd updateImpl(
		MiicSafeguardGoodAdd miicSafeguardGoodAdd);

	/**
	 * Returns the miic safeguard good add with the primary key or throws a <code>NoSuchMiicSafeguardGoodAddException</code> if it could not be found.
	 *
	 * @param miicSafeguardGoodAddId the primary key of the miic safeguard good add
	 * @return the miic safeguard good add
	 * @throws NoSuchMiicSafeguardGoodAddException if a miic safeguard good add with the primary key could not be found
	 */
	public MiicSafeguardGoodAdd findByPrimaryKey(long miicSafeguardGoodAddId)
		throws NoSuchMiicSafeguardGoodAddException;

	/**
	 * Returns the miic safeguard good add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicSafeguardGoodAddId the primary key of the miic safeguard good add
	 * @return the miic safeguard good add, or <code>null</code> if a miic safeguard good add with the primary key could not be found
	 */
	public MiicSafeguardGoodAdd fetchByPrimaryKey(long miicSafeguardGoodAddId);

	/**
	 * Returns all the miic safeguard good adds.
	 *
	 * @return the miic safeguard good adds
	 */
	public java.util.List<MiicSafeguardGoodAdd> findAll();

	/**
	 * Returns a range of all the miic safeguard good adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @return the range of miic safeguard good adds
	 */
	public java.util.List<MiicSafeguardGoodAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the miic safeguard good adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic safeguard good adds
	 */
	public java.util.List<MiicSafeguardGoodAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicSafeguardGoodAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic safeguard good adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic safeguard good adds
	 */
	public java.util.List<MiicSafeguardGoodAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicSafeguardGoodAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the miic safeguard good adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of miic safeguard good adds.
	 *
	 * @return the number of miic safeguard good adds
	 */
	public int countAll();

}