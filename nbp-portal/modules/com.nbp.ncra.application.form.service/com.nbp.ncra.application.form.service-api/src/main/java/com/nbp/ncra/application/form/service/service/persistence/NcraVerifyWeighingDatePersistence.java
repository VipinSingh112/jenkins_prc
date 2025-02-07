/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncra.application.form.service.exception.NoSuchNcraVerifyWeighingDateException;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncra verify weighing date service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraVerifyWeighingDateUtil
 * @generated
 */
@ProviderType
public interface NcraVerifyWeighingDatePersistence
	extends BasePersistence<NcraVerifyWeighingDate> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcraVerifyWeighingDateUtil} to access the ncra verify weighing date persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncra verify weighing date where ncraApplicationId = &#63; or throws a <code>NoSuchNcraVerifyWeighingDateException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra verify weighing date
	 * @throws NoSuchNcraVerifyWeighingDateException if a matching ncra verify weighing date could not be found
	 */
	public NcraVerifyWeighingDate findBygetNcraVerify_By_Date(
			long ncraApplicationId)
		throws NoSuchNcraVerifyWeighingDateException;

	/**
	 * Returns the ncra verify weighing date where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra verify weighing date, or <code>null</code> if a matching ncra verify weighing date could not be found
	 */
	public NcraVerifyWeighingDate fetchBygetNcraVerify_By_Date(
		long ncraApplicationId);

	/**
	 * Returns the ncra verify weighing date where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra verify weighing date, or <code>null</code> if a matching ncra verify weighing date could not be found
	 */
	public NcraVerifyWeighingDate fetchBygetNcraVerify_By_Date(
		long ncraApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncra verify weighing date where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra verify weighing date that was removed
	 */
	public NcraVerifyWeighingDate removeBygetNcraVerify_By_Date(
			long ncraApplicationId)
		throws NoSuchNcraVerifyWeighingDateException;

	/**
	 * Returns the number of ncra verify weighing dates where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra verify weighing dates
	 */
	public int countBygetNcraVerify_By_Date(long ncraApplicationId);

	/**
	 * Caches the ncra verify weighing date in the entity cache if it is enabled.
	 *
	 * @param ncraVerifyWeighingDate the ncra verify weighing date
	 */
	public void cacheResult(NcraVerifyWeighingDate ncraVerifyWeighingDate);

	/**
	 * Caches the ncra verify weighing dates in the entity cache if it is enabled.
	 *
	 * @param ncraVerifyWeighingDates the ncra verify weighing dates
	 */
	public void cacheResult(
		java.util.List<NcraVerifyWeighingDate> ncraVerifyWeighingDates);

	/**
	 * Creates a new ncra verify weighing date with the primary key. Does not add the ncra verify weighing date to the database.
	 *
	 * @param ncraVerifyWeighingDateId the primary key for the new ncra verify weighing date
	 * @return the new ncra verify weighing date
	 */
	public NcraVerifyWeighingDate create(long ncraVerifyWeighingDateId);

	/**
	 * Removes the ncra verify weighing date with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraVerifyWeighingDateId the primary key of the ncra verify weighing date
	 * @return the ncra verify weighing date that was removed
	 * @throws NoSuchNcraVerifyWeighingDateException if a ncra verify weighing date with the primary key could not be found
	 */
	public NcraVerifyWeighingDate remove(long ncraVerifyWeighingDateId)
		throws NoSuchNcraVerifyWeighingDateException;

	public NcraVerifyWeighingDate updateImpl(
		NcraVerifyWeighingDate ncraVerifyWeighingDate);

	/**
	 * Returns the ncra verify weighing date with the primary key or throws a <code>NoSuchNcraVerifyWeighingDateException</code> if it could not be found.
	 *
	 * @param ncraVerifyWeighingDateId the primary key of the ncra verify weighing date
	 * @return the ncra verify weighing date
	 * @throws NoSuchNcraVerifyWeighingDateException if a ncra verify weighing date with the primary key could not be found
	 */
	public NcraVerifyWeighingDate findByPrimaryKey(
			long ncraVerifyWeighingDateId)
		throws NoSuchNcraVerifyWeighingDateException;

	/**
	 * Returns the ncra verify weighing date with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraVerifyWeighingDateId the primary key of the ncra verify weighing date
	 * @return the ncra verify weighing date, or <code>null</code> if a ncra verify weighing date with the primary key could not be found
	 */
	public NcraVerifyWeighingDate fetchByPrimaryKey(
		long ncraVerifyWeighingDateId);

	/**
	 * Returns all the ncra verify weighing dates.
	 *
	 * @return the ncra verify weighing dates
	 */
	public java.util.List<NcraVerifyWeighingDate> findAll();

	/**
	 * Returns a range of all the ncra verify weighing dates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing dates
	 * @param end the upper bound of the range of ncra verify weighing dates (not inclusive)
	 * @return the range of ncra verify weighing dates
	 */
	public java.util.List<NcraVerifyWeighingDate> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncra verify weighing dates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing dates
	 * @param end the upper bound of the range of ncra verify weighing dates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra verify weighing dates
	 */
	public java.util.List<NcraVerifyWeighingDate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraVerifyWeighingDate>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra verify weighing dates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing dates
	 * @param end the upper bound of the range of ncra verify weighing dates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra verify weighing dates
	 */
	public java.util.List<NcraVerifyWeighingDate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraVerifyWeighingDate>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncra verify weighing dates from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncra verify weighing dates.
	 *
	 * @return the number of ncra verify weighing dates
	 */
	public int countAll();

}