/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.miic.application.form.services.exception.NoSuchMiicSuspensionOfCetException;
import com.nbp.miic.application.form.services.model.MiicSuspensionOfCet;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the miic suspension of cet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicSuspensionOfCetUtil
 * @generated
 */
@ProviderType
public interface MiicSuspensionOfCetPersistence
	extends BasePersistence<MiicSuspensionOfCet> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiicSuspensionOfCetUtil} to access the miic suspension of cet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the miic suspension of cet where miicApplicationId = &#63; or throws a <code>NoSuchMiicSuspensionOfCetException</code> if it could not be found.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic suspension of cet
	 * @throws NoSuchMiicSuspensionOfCetException if a matching miic suspension of cet could not be found
	 */
	public MiicSuspensionOfCet findBygetMiicById(long miicApplicationId)
		throws NoSuchMiicSuspensionOfCetException;

	/**
	 * Returns the miic suspension of cet where miicApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic suspension of cet, or <code>null</code> if a matching miic suspension of cet could not be found
	 */
	public MiicSuspensionOfCet fetchBygetMiicById(long miicApplicationId);

	/**
	 * Returns the miic suspension of cet where miicApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic suspension of cet, or <code>null</code> if a matching miic suspension of cet could not be found
	 */
	public MiicSuspensionOfCet fetchBygetMiicById(
		long miicApplicationId, boolean useFinderCache);

	/**
	 * Removes the miic suspension of cet where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the miic suspension of cet that was removed
	 */
	public MiicSuspensionOfCet removeBygetMiicById(long miicApplicationId)
		throws NoSuchMiicSuspensionOfCetException;

	/**
	 * Returns the number of miic suspension of cets where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic suspension of cets
	 */
	public int countBygetMiicById(long miicApplicationId);

	/**
	 * Caches the miic suspension of cet in the entity cache if it is enabled.
	 *
	 * @param miicSuspensionOfCet the miic suspension of cet
	 */
	public void cacheResult(MiicSuspensionOfCet miicSuspensionOfCet);

	/**
	 * Caches the miic suspension of cets in the entity cache if it is enabled.
	 *
	 * @param miicSuspensionOfCets the miic suspension of cets
	 */
	public void cacheResult(
		java.util.List<MiicSuspensionOfCet> miicSuspensionOfCets);

	/**
	 * Creates a new miic suspension of cet with the primary key. Does not add the miic suspension of cet to the database.
	 *
	 * @param miicSuspensionOfCetId the primary key for the new miic suspension of cet
	 * @return the new miic suspension of cet
	 */
	public MiicSuspensionOfCet create(long miicSuspensionOfCetId);

	/**
	 * Removes the miic suspension of cet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicSuspensionOfCetId the primary key of the miic suspension of cet
	 * @return the miic suspension of cet that was removed
	 * @throws NoSuchMiicSuspensionOfCetException if a miic suspension of cet with the primary key could not be found
	 */
	public MiicSuspensionOfCet remove(long miicSuspensionOfCetId)
		throws NoSuchMiicSuspensionOfCetException;

	public MiicSuspensionOfCet updateImpl(
		MiicSuspensionOfCet miicSuspensionOfCet);

	/**
	 * Returns the miic suspension of cet with the primary key or throws a <code>NoSuchMiicSuspensionOfCetException</code> if it could not be found.
	 *
	 * @param miicSuspensionOfCetId the primary key of the miic suspension of cet
	 * @return the miic suspension of cet
	 * @throws NoSuchMiicSuspensionOfCetException if a miic suspension of cet with the primary key could not be found
	 */
	public MiicSuspensionOfCet findByPrimaryKey(long miicSuspensionOfCetId)
		throws NoSuchMiicSuspensionOfCetException;

	/**
	 * Returns the miic suspension of cet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicSuspensionOfCetId the primary key of the miic suspension of cet
	 * @return the miic suspension of cet, or <code>null</code> if a miic suspension of cet with the primary key could not be found
	 */
	public MiicSuspensionOfCet fetchByPrimaryKey(long miicSuspensionOfCetId);

	/**
	 * Returns all the miic suspension of cets.
	 *
	 * @return the miic suspension of cets
	 */
	public java.util.List<MiicSuspensionOfCet> findAll();

	/**
	 * Returns a range of all the miic suspension of cets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cets
	 * @param end the upper bound of the range of miic suspension of cets (not inclusive)
	 * @return the range of miic suspension of cets
	 */
	public java.util.List<MiicSuspensionOfCet> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the miic suspension of cets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cets
	 * @param end the upper bound of the range of miic suspension of cets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic suspension of cets
	 */
	public java.util.List<MiicSuspensionOfCet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicSuspensionOfCet>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic suspension of cets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cets
	 * @param end the upper bound of the range of miic suspension of cets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic suspension of cets
	 */
	public java.util.List<MiicSuspensionOfCet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicSuspensionOfCet>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the miic suspension of cets from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of miic suspension of cets.
	 *
	 * @return the number of miic suspension of cets
	 */
	public int countAll();

}