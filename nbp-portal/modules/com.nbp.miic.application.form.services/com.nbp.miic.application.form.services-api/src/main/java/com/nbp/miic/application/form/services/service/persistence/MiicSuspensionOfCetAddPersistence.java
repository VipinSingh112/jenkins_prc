/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.miic.application.form.services.exception.NoSuchMiicSuspensionOfCetAddException;
import com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the miic suspension of cet add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicSuspensionOfCetAddUtil
 * @generated
 */
@ProviderType
public interface MiicSuspensionOfCetAddPersistence
	extends BasePersistence<MiicSuspensionOfCetAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiicSuspensionOfCetAddUtil} to access the miic suspension of cet add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the miic suspension of cet adds where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic suspension of cet adds
	 */
	public java.util.List<MiicSuspensionOfCetAdd> findBygetMiicById(
		long miicApplicationId);

	/**
	 * Returns a range of all the miic suspension of cet adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @return the range of matching miic suspension of cet adds
	 */
	public java.util.List<MiicSuspensionOfCetAdd> findBygetMiicById(
		long miicApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the miic suspension of cet adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic suspension of cet adds
	 */
	public java.util.List<MiicSuspensionOfCetAdd> findBygetMiicById(
		long miicApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicSuspensionOfCetAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic suspension of cet adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic suspension of cet adds
	 */
	public java.util.List<MiicSuspensionOfCetAdd> findBygetMiicById(
		long miicApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicSuspensionOfCetAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first miic suspension of cet add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic suspension of cet add
	 * @throws NoSuchMiicSuspensionOfCetAddException if a matching miic suspension of cet add could not be found
	 */
	public MiicSuspensionOfCetAdd findBygetMiicById_First(
			long miicApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicSuspensionOfCetAdd> orderByComparator)
		throws NoSuchMiicSuspensionOfCetAddException;

	/**
	 * Returns the first miic suspension of cet add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic suspension of cet add, or <code>null</code> if a matching miic suspension of cet add could not be found
	 */
	public MiicSuspensionOfCetAdd fetchBygetMiicById_First(
		long miicApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<MiicSuspensionOfCetAdd>
			orderByComparator);

	/**
	 * Returns the last miic suspension of cet add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic suspension of cet add
	 * @throws NoSuchMiicSuspensionOfCetAddException if a matching miic suspension of cet add could not be found
	 */
	public MiicSuspensionOfCetAdd findBygetMiicById_Last(
			long miicApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicSuspensionOfCetAdd> orderByComparator)
		throws NoSuchMiicSuspensionOfCetAddException;

	/**
	 * Returns the last miic suspension of cet add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic suspension of cet add, or <code>null</code> if a matching miic suspension of cet add could not be found
	 */
	public MiicSuspensionOfCetAdd fetchBygetMiicById_Last(
		long miicApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<MiicSuspensionOfCetAdd>
			orderByComparator);

	/**
	 * Returns the miic suspension of cet adds before and after the current miic suspension of cet add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicSuspensionOfCetAddId the primary key of the current miic suspension of cet add
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic suspension of cet add
	 * @throws NoSuchMiicSuspensionOfCetAddException if a miic suspension of cet add with the primary key could not be found
	 */
	public MiicSuspensionOfCetAdd[] findBygetMiicById_PrevAndNext(
			long miicSuspensionOfCetAddId, long miicApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicSuspensionOfCetAdd> orderByComparator)
		throws NoSuchMiicSuspensionOfCetAddException;

	/**
	 * Removes all the miic suspension of cet adds where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 */
	public void removeBygetMiicById(long miicApplicationId);

	/**
	 * Returns the number of miic suspension of cet adds where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic suspension of cet adds
	 */
	public int countBygetMiicById(long miicApplicationId);

	/**
	 * Caches the miic suspension of cet add in the entity cache if it is enabled.
	 *
	 * @param miicSuspensionOfCetAdd the miic suspension of cet add
	 */
	public void cacheResult(MiicSuspensionOfCetAdd miicSuspensionOfCetAdd);

	/**
	 * Caches the miic suspension of cet adds in the entity cache if it is enabled.
	 *
	 * @param miicSuspensionOfCetAdds the miic suspension of cet adds
	 */
	public void cacheResult(
		java.util.List<MiicSuspensionOfCetAdd> miicSuspensionOfCetAdds);

	/**
	 * Creates a new miic suspension of cet add with the primary key. Does not add the miic suspension of cet add to the database.
	 *
	 * @param miicSuspensionOfCetAddId the primary key for the new miic suspension of cet add
	 * @return the new miic suspension of cet add
	 */
	public MiicSuspensionOfCetAdd create(long miicSuspensionOfCetAddId);

	/**
	 * Removes the miic suspension of cet add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicSuspensionOfCetAddId the primary key of the miic suspension of cet add
	 * @return the miic suspension of cet add that was removed
	 * @throws NoSuchMiicSuspensionOfCetAddException if a miic suspension of cet add with the primary key could not be found
	 */
	public MiicSuspensionOfCetAdd remove(long miicSuspensionOfCetAddId)
		throws NoSuchMiicSuspensionOfCetAddException;

	public MiicSuspensionOfCetAdd updateImpl(
		MiicSuspensionOfCetAdd miicSuspensionOfCetAdd);

	/**
	 * Returns the miic suspension of cet add with the primary key or throws a <code>NoSuchMiicSuspensionOfCetAddException</code> if it could not be found.
	 *
	 * @param miicSuspensionOfCetAddId the primary key of the miic suspension of cet add
	 * @return the miic suspension of cet add
	 * @throws NoSuchMiicSuspensionOfCetAddException if a miic suspension of cet add with the primary key could not be found
	 */
	public MiicSuspensionOfCetAdd findByPrimaryKey(
			long miicSuspensionOfCetAddId)
		throws NoSuchMiicSuspensionOfCetAddException;

	/**
	 * Returns the miic suspension of cet add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicSuspensionOfCetAddId the primary key of the miic suspension of cet add
	 * @return the miic suspension of cet add, or <code>null</code> if a miic suspension of cet add with the primary key could not be found
	 */
	public MiicSuspensionOfCetAdd fetchByPrimaryKey(
		long miicSuspensionOfCetAddId);

	/**
	 * Returns all the miic suspension of cet adds.
	 *
	 * @return the miic suspension of cet adds
	 */
	public java.util.List<MiicSuspensionOfCetAdd> findAll();

	/**
	 * Returns a range of all the miic suspension of cet adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @return the range of miic suspension of cet adds
	 */
	public java.util.List<MiicSuspensionOfCetAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the miic suspension of cet adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic suspension of cet adds
	 */
	public java.util.List<MiicSuspensionOfCetAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicSuspensionOfCetAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic suspension of cet adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic suspension of cet adds
	 */
	public java.util.List<MiicSuspensionOfCetAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicSuspensionOfCetAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the miic suspension of cet adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of miic suspension of cet adds.
	 *
	 * @return the number of miic suspension of cet adds
	 */
	public int countAll();

}