/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuExportDataException;
import com.nbp.manufacturing.application.form.service.model.ManuExportData;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the manu export data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuExportDataUtil
 * @generated
 */
@ProviderType
public interface ManuExportDataPersistence
	extends BasePersistence<ManuExportData> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManuExportDataUtil} to access the manu export data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the manu export data where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuExportDataException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu export data
	 * @throws NoSuchManuExportDataException if a matching manu export data could not be found
	 */
	public ManuExportData findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuExportDataException;

	/**
	 * Returns the manu export data where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu export data, or <code>null</code> if a matching manu export data could not be found
	 */
	public ManuExportData fetchBygetManufactureById(
		long manufacturingApplicationId);

	/**
	 * Returns the manu export data where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu export data, or <code>null</code> if a matching manu export data could not be found
	 */
	public ManuExportData fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache);

	/**
	 * Removes the manu export data where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu export data that was removed
	 */
	public ManuExportData removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuExportDataException;

	/**
	 * Returns the number of manu export datas where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu export datas
	 */
	public int countBygetManufactureById(long manufacturingApplicationId);

	/**
	 * Returns all the manu export datas where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu export datas
	 */
	public java.util.List<ManuExportData> findBygetMA_ED_MAI(
		long manufacturingApplicationId);

	/**
	 * Returns a range of all the manu export datas where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuExportDataModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu export datas
	 * @param end the upper bound of the range of manu export datas (not inclusive)
	 * @return the range of matching manu export datas
	 */
	public java.util.List<ManuExportData> findBygetMA_ED_MAI(
		long manufacturingApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the manu export datas where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuExportDataModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu export datas
	 * @param end the upper bound of the range of manu export datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu export datas
	 */
	public java.util.List<ManuExportData> findBygetMA_ED_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuExportData>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu export datas where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuExportDataModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu export datas
	 * @param end the upper bound of the range of manu export datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu export datas
	 */
	public java.util.List<ManuExportData> findBygetMA_ED_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuExportData>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first manu export data in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu export data
	 * @throws NoSuchManuExportDataException if a matching manu export data could not be found
	 */
	public ManuExportData findBygetMA_ED_MAI_First(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuExportData>
				orderByComparator)
		throws NoSuchManuExportDataException;

	/**
	 * Returns the first manu export data in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu export data, or <code>null</code> if a matching manu export data could not be found
	 */
	public ManuExportData fetchBygetMA_ED_MAI_First(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuExportData>
			orderByComparator);

	/**
	 * Returns the last manu export data in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu export data
	 * @throws NoSuchManuExportDataException if a matching manu export data could not be found
	 */
	public ManuExportData findBygetMA_ED_MAI_Last(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuExportData>
				orderByComparator)
		throws NoSuchManuExportDataException;

	/**
	 * Returns the last manu export data in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu export data, or <code>null</code> if a matching manu export data could not be found
	 */
	public ManuExportData fetchBygetMA_ED_MAI_Last(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuExportData>
			orderByComparator);

	/**
	 * Returns the manu export datas before and after the current manu export data in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuExportDataId the primary key of the current manu export data
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu export data
	 * @throws NoSuchManuExportDataException if a manu export data with the primary key could not be found
	 */
	public ManuExportData[] findBygetMA_ED_MAI_PrevAndNext(
			long manuExportDataId, long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuExportData>
				orderByComparator)
		throws NoSuchManuExportDataException;

	/**
	 * Removes all the manu export datas where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public void removeBygetMA_ED_MAI(long manufacturingApplicationId);

	/**
	 * Returns the number of manu export datas where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu export datas
	 */
	public int countBygetMA_ED_MAI(long manufacturingApplicationId);

	/**
	 * Caches the manu export data in the entity cache if it is enabled.
	 *
	 * @param manuExportData the manu export data
	 */
	public void cacheResult(ManuExportData manuExportData);

	/**
	 * Caches the manu export datas in the entity cache if it is enabled.
	 *
	 * @param manuExportDatas the manu export datas
	 */
	public void cacheResult(java.util.List<ManuExportData> manuExportDatas);

	/**
	 * Creates a new manu export data with the primary key. Does not add the manu export data to the database.
	 *
	 * @param manuExportDataId the primary key for the new manu export data
	 * @return the new manu export data
	 */
	public ManuExportData create(long manuExportDataId);

	/**
	 * Removes the manu export data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuExportDataId the primary key of the manu export data
	 * @return the manu export data that was removed
	 * @throws NoSuchManuExportDataException if a manu export data with the primary key could not be found
	 */
	public ManuExportData remove(long manuExportDataId)
		throws NoSuchManuExportDataException;

	public ManuExportData updateImpl(ManuExportData manuExportData);

	/**
	 * Returns the manu export data with the primary key or throws a <code>NoSuchManuExportDataException</code> if it could not be found.
	 *
	 * @param manuExportDataId the primary key of the manu export data
	 * @return the manu export data
	 * @throws NoSuchManuExportDataException if a manu export data with the primary key could not be found
	 */
	public ManuExportData findByPrimaryKey(long manuExportDataId)
		throws NoSuchManuExportDataException;

	/**
	 * Returns the manu export data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuExportDataId the primary key of the manu export data
	 * @return the manu export data, or <code>null</code> if a manu export data with the primary key could not be found
	 */
	public ManuExportData fetchByPrimaryKey(long manuExportDataId);

	/**
	 * Returns all the manu export datas.
	 *
	 * @return the manu export datas
	 */
	public java.util.List<ManuExportData> findAll();

	/**
	 * Returns a range of all the manu export datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuExportDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu export datas
	 * @param end the upper bound of the range of manu export datas (not inclusive)
	 * @return the range of manu export datas
	 */
	public java.util.List<ManuExportData> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the manu export datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuExportDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu export datas
	 * @param end the upper bound of the range of manu export datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu export datas
	 */
	public java.util.List<ManuExportData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuExportData>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu export datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuExportDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu export datas
	 * @param end the upper bound of the range of manu export datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu export datas
	 */
	public java.util.List<ManuExportData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuExportData>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the manu export datas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of manu export datas.
	 *
	 * @return the number of manu export datas
	 */
	public int countAll();

}