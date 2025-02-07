/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuExportDataException;
import com.nbp.manufacturing.application.form.service.model.ManuExportData;
import com.nbp.manufacturing.application.form.service.model.ManuExportDataTable;
import com.nbp.manufacturing.application.form.service.model.impl.ManuExportDataImpl;
import com.nbp.manufacturing.application.form.service.model.impl.ManuExportDataModelImpl;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuExportDataPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuExportDataUtil;
import com.nbp.manufacturing.application.form.service.service.persistence.impl.constants.MANUFACTURINGPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the manu export data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ManuExportDataPersistence.class)
public class ManuExportDataPersistenceImpl
	extends BasePersistenceImpl<ManuExportData>
	implements ManuExportDataPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ManuExportDataUtil</code> to access the manu export data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ManuExportDataImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetManufactureById;
	private FinderPath _finderPathCountBygetManufactureById;

	/**
	 * Returns the manu export data where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuExportDataException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu export data
	 * @throws NoSuchManuExportDataException if a matching manu export data could not be found
	 */
	@Override
	public ManuExportData findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuExportDataException {

		ManuExportData manuExportData = fetchBygetManufactureById(
			manufacturingApplicationId);

		if (manuExportData == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("manufacturingApplicationId=");
			sb.append(manufacturingApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManuExportDataException(sb.toString());
		}

		return manuExportData;
	}

	/**
	 * Returns the manu export data where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu export data, or <code>null</code> if a matching manu export data could not be found
	 */
	@Override
	public ManuExportData fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return fetchBygetManufactureById(manufacturingApplicationId, true);
	}

	/**
	 * Returns the manu export data where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu export data, or <code>null</code> if a matching manu export data could not be found
	 */
	@Override
	public ManuExportData fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {manufacturingApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetManufactureById, finderArgs, this);
		}

		if (result instanceof ManuExportData) {
			ManuExportData manuExportData = (ManuExportData)result;

			if (manufacturingApplicationId !=
					manuExportData.getManufacturingApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MANUEXPORTDATA_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				List<ManuExportData> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetManufactureById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									manufacturingApplicationId
								};
							}

							_log.warn(
								"ManuExportDataPersistenceImpl.fetchBygetManufactureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManuExportData manuExportData = list.get(0);

					result = manuExportData;

					cacheResult(manuExportData);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (ManuExportData)result;
		}
	}

	/**
	 * Removes the manu export data where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu export data that was removed
	 */
	@Override
	public ManuExportData removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuExportDataException {

		ManuExportData manuExportData = findBygetManufactureById(
			manufacturingApplicationId);

		return remove(manuExportData);
	}

	/**
	 * Returns the number of manu export datas where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu export datas
	 */
	@Override
	public int countBygetManufactureById(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetManufactureById;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUEXPORTDATA_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2 =
			"manuExportData.manufacturingApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMA_ED_MAI;
	private FinderPath _finderPathWithoutPaginationFindBygetMA_ED_MAI;
	private FinderPath _finderPathCountBygetMA_ED_MAI;

	/**
	 * Returns all the manu export datas where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu export datas
	 */
	@Override
	public List<ManuExportData> findBygetMA_ED_MAI(
		long manufacturingApplicationId) {

		return findBygetMA_ED_MAI(
			manufacturingApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

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
	@Override
	public List<ManuExportData> findBygetMA_ED_MAI(
		long manufacturingApplicationId, int start, int end) {

		return findBygetMA_ED_MAI(manufacturingApplicationId, start, end, null);
	}

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
	@Override
	public List<ManuExportData> findBygetMA_ED_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuExportData> orderByComparator) {

		return findBygetMA_ED_MAI(
			manufacturingApplicationId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<ManuExportData> findBygetMA_ED_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuExportData> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMA_ED_MAI;
				finderArgs = new Object[] {manufacturingApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMA_ED_MAI;
			finderArgs = new Object[] {
				manufacturingApplicationId, start, end, orderByComparator
			};
		}

		List<ManuExportData> list = null;

		if (useFinderCache) {
			list = (List<ManuExportData>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManuExportData manuExportData : list) {
					if (manufacturingApplicationId !=
							manuExportData.getManufacturingApplicationId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MANUEXPORTDATA_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_ED_MAI_MANUFACTURINGAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManuExportDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				list = (List<ManuExportData>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first manu export data in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu export data
	 * @throws NoSuchManuExportDataException if a matching manu export data could not be found
	 */
	@Override
	public ManuExportData findBygetMA_ED_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuExportData> orderByComparator)
		throws NoSuchManuExportDataException {

		ManuExportData manuExportData = fetchBygetMA_ED_MAI_First(
			manufacturingApplicationId, orderByComparator);

		if (manuExportData != null) {
			return manuExportData;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuExportDataException(sb.toString());
	}

	/**
	 * Returns the first manu export data in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu export data, or <code>null</code> if a matching manu export data could not be found
	 */
	@Override
	public ManuExportData fetchBygetMA_ED_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuExportData> orderByComparator) {

		List<ManuExportData> list = findBygetMA_ED_MAI(
			manufacturingApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manu export data in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu export data
	 * @throws NoSuchManuExportDataException if a matching manu export data could not be found
	 */
	@Override
	public ManuExportData findBygetMA_ED_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuExportData> orderByComparator)
		throws NoSuchManuExportDataException {

		ManuExportData manuExportData = fetchBygetMA_ED_MAI_Last(
			manufacturingApplicationId, orderByComparator);

		if (manuExportData != null) {
			return manuExportData;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuExportDataException(sb.toString());
	}

	/**
	 * Returns the last manu export data in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu export data, or <code>null</code> if a matching manu export data could not be found
	 */
	@Override
	public ManuExportData fetchBygetMA_ED_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuExportData> orderByComparator) {

		int count = countBygetMA_ED_MAI(manufacturingApplicationId);

		if (count == 0) {
			return null;
		}

		List<ManuExportData> list = findBygetMA_ED_MAI(
			manufacturingApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manu export datas before and after the current manu export data in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuExportDataId the primary key of the current manu export data
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu export data
	 * @throws NoSuchManuExportDataException if a manu export data with the primary key could not be found
	 */
	@Override
	public ManuExportData[] findBygetMA_ED_MAI_PrevAndNext(
			long manuExportDataId, long manufacturingApplicationId,
			OrderByComparator<ManuExportData> orderByComparator)
		throws NoSuchManuExportDataException {

		ManuExportData manuExportData = findByPrimaryKey(manuExportDataId);

		Session session = null;

		try {
			session = openSession();

			ManuExportData[] array = new ManuExportDataImpl[3];

			array[0] = getBygetMA_ED_MAI_PrevAndNext(
				session, manuExportData, manufacturingApplicationId,
				orderByComparator, true);

			array[1] = manuExportData;

			array[2] = getBygetMA_ED_MAI_PrevAndNext(
				session, manuExportData, manufacturingApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ManuExportData getBygetMA_ED_MAI_PrevAndNext(
		Session session, ManuExportData manuExportData,
		long manufacturingApplicationId,
		OrderByComparator<ManuExportData> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MANUEXPORTDATA_WHERE);

		sb.append(_FINDER_COLUMN_GETMA_ED_MAI_MANUFACTURINGAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ManuExportDataModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(manufacturingApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						manuExportData)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManuExportData> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manu export datas where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	@Override
	public void removeBygetMA_ED_MAI(long manufacturingApplicationId) {
		for (ManuExportData manuExportData :
				findBygetMA_ED_MAI(
					manufacturingApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(manuExportData);
		}
	}

	/**
	 * Returns the number of manu export datas where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu export datas
	 */
	@Override
	public int countBygetMA_ED_MAI(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMA_ED_MAI;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUEXPORTDATA_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_ED_MAI_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMA_ED_MAI_MANUFACTURINGAPPLICATIONID_2 =
			"manuExportData.manufacturingApplicationId = ?";

	public ManuExportDataPersistenceImpl() {
		setModelClass(ManuExportData.class);

		setModelImplClass(ManuExportDataImpl.class);
		setModelPKClass(long.class);

		setTable(ManuExportDataTable.INSTANCE);
	}

	/**
	 * Caches the manu export data in the entity cache if it is enabled.
	 *
	 * @param manuExportData the manu export data
	 */
	@Override
	public void cacheResult(ManuExportData manuExportData) {
		entityCache.putResult(
			ManuExportDataImpl.class, manuExportData.getPrimaryKey(),
			manuExportData);

		finderCache.putResult(
			_finderPathFetchBygetManufactureById,
			new Object[] {manuExportData.getManufacturingApplicationId()},
			manuExportData);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the manu export datas in the entity cache if it is enabled.
	 *
	 * @param manuExportDatas the manu export datas
	 */
	@Override
	public void cacheResult(List<ManuExportData> manuExportDatas) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (manuExportDatas.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ManuExportData manuExportData : manuExportDatas) {
			if (entityCache.getResult(
					ManuExportDataImpl.class, manuExportData.getPrimaryKey()) ==
						null) {

				cacheResult(manuExportData);
			}
		}
	}

	/**
	 * Clears the cache for all manu export datas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ManuExportDataImpl.class);

		finderCache.clearCache(ManuExportDataImpl.class);
	}

	/**
	 * Clears the cache for the manu export data.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ManuExportData manuExportData) {
		entityCache.removeResult(ManuExportDataImpl.class, manuExportData);
	}

	@Override
	public void clearCache(List<ManuExportData> manuExportDatas) {
		for (ManuExportData manuExportData : manuExportDatas) {
			entityCache.removeResult(ManuExportDataImpl.class, manuExportData);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ManuExportDataImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ManuExportDataImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ManuExportDataModelImpl manuExportDataModelImpl) {

		Object[] args = new Object[] {
			manuExportDataModelImpl.getManufacturingApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetManufactureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManufactureById, args,
			manuExportDataModelImpl);
	}

	/**
	 * Creates a new manu export data with the primary key. Does not add the manu export data to the database.
	 *
	 * @param manuExportDataId the primary key for the new manu export data
	 * @return the new manu export data
	 */
	@Override
	public ManuExportData create(long manuExportDataId) {
		ManuExportData manuExportData = new ManuExportDataImpl();

		manuExportData.setNew(true);
		manuExportData.setPrimaryKey(manuExportDataId);

		manuExportData.setCompanyId(CompanyThreadLocal.getCompanyId());

		return manuExportData;
	}

	/**
	 * Removes the manu export data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuExportDataId the primary key of the manu export data
	 * @return the manu export data that was removed
	 * @throws NoSuchManuExportDataException if a manu export data with the primary key could not be found
	 */
	@Override
	public ManuExportData remove(long manuExportDataId)
		throws NoSuchManuExportDataException {

		return remove((Serializable)manuExportDataId);
	}

	/**
	 * Removes the manu export data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the manu export data
	 * @return the manu export data that was removed
	 * @throws NoSuchManuExportDataException if a manu export data with the primary key could not be found
	 */
	@Override
	public ManuExportData remove(Serializable primaryKey)
		throws NoSuchManuExportDataException {

		Session session = null;

		try {
			session = openSession();

			ManuExportData manuExportData = (ManuExportData)session.get(
				ManuExportDataImpl.class, primaryKey);

			if (manuExportData == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchManuExportDataException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(manuExportData);
		}
		catch (NoSuchManuExportDataException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ManuExportData removeImpl(ManuExportData manuExportData) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(manuExportData)) {
				manuExportData = (ManuExportData)session.get(
					ManuExportDataImpl.class,
					manuExportData.getPrimaryKeyObj());
			}

			if (manuExportData != null) {
				session.delete(manuExportData);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (manuExportData != null) {
			clearCache(manuExportData);
		}

		return manuExportData;
	}

	@Override
	public ManuExportData updateImpl(ManuExportData manuExportData) {
		boolean isNew = manuExportData.isNew();

		if (!(manuExportData instanceof ManuExportDataModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(manuExportData.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					manuExportData);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in manuExportData proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ManuExportData implementation " +
					manuExportData.getClass());
		}

		ManuExportDataModelImpl manuExportDataModelImpl =
			(ManuExportDataModelImpl)manuExportData;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (manuExportData.getCreateDate() == null)) {
			if (serviceContext == null) {
				manuExportData.setCreateDate(date);
			}
			else {
				manuExportData.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!manuExportDataModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				manuExportData.setModifiedDate(date);
			}
			else {
				manuExportData.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(manuExportData);
			}
			else {
				manuExportData = (ManuExportData)session.merge(manuExportData);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ManuExportDataImpl.class, manuExportDataModelImpl, false, true);

		cacheUniqueFindersCache(manuExportDataModelImpl);

		if (isNew) {
			manuExportData.setNew(false);
		}

		manuExportData.resetOriginalValues();

		return manuExportData;
	}

	/**
	 * Returns the manu export data with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the manu export data
	 * @return the manu export data
	 * @throws NoSuchManuExportDataException if a manu export data with the primary key could not be found
	 */
	@Override
	public ManuExportData findByPrimaryKey(Serializable primaryKey)
		throws NoSuchManuExportDataException {

		ManuExportData manuExportData = fetchByPrimaryKey(primaryKey);

		if (manuExportData == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchManuExportDataException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return manuExportData;
	}

	/**
	 * Returns the manu export data with the primary key or throws a <code>NoSuchManuExportDataException</code> if it could not be found.
	 *
	 * @param manuExportDataId the primary key of the manu export data
	 * @return the manu export data
	 * @throws NoSuchManuExportDataException if a manu export data with the primary key could not be found
	 */
	@Override
	public ManuExportData findByPrimaryKey(long manuExportDataId)
		throws NoSuchManuExportDataException {

		return findByPrimaryKey((Serializable)manuExportDataId);
	}

	/**
	 * Returns the manu export data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuExportDataId the primary key of the manu export data
	 * @return the manu export data, or <code>null</code> if a manu export data with the primary key could not be found
	 */
	@Override
	public ManuExportData fetchByPrimaryKey(long manuExportDataId) {
		return fetchByPrimaryKey((Serializable)manuExportDataId);
	}

	/**
	 * Returns all the manu export datas.
	 *
	 * @return the manu export datas
	 */
	@Override
	public List<ManuExportData> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ManuExportData> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<ManuExportData> findAll(
		int start, int end,
		OrderByComparator<ManuExportData> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<ManuExportData> findAll(
		int start, int end, OrderByComparator<ManuExportData> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<ManuExportData> list = null;

		if (useFinderCache) {
			list = (List<ManuExportData>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MANUEXPORTDATA);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MANUEXPORTDATA;

				sql = sql.concat(ManuExportDataModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ManuExportData>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the manu export datas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ManuExportData manuExportData : findAll()) {
			remove(manuExportData);
		}
	}

	/**
	 * Returns the number of manu export datas.
	 *
	 * @return the number of manu export datas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_MANUEXPORTDATA);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "manuExportDataId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MANUEXPORTDATA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ManuExportDataModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the manu export data persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetManufactureById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetManufactureById",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetManufactureById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManufactureById", new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		_finderPathWithPaginationFindBygetMA_ED_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMA_ED_MAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMA_ED_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMA_ED_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetMA_ED_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMA_ED_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		ManuExportDataUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ManuExportDataUtil.setPersistence(null);

		entityCache.removeCache(ManuExportDataImpl.class.getName());
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MANUEXPORTDATA =
		"SELECT manuExportData FROM ManuExportData manuExportData";

	private static final String _SQL_SELECT_MANUEXPORTDATA_WHERE =
		"SELECT manuExportData FROM ManuExportData manuExportData WHERE ";

	private static final String _SQL_COUNT_MANUEXPORTDATA =
		"SELECT COUNT(manuExportData) FROM ManuExportData manuExportData";

	private static final String _SQL_COUNT_MANUEXPORTDATA_WHERE =
		"SELECT COUNT(manuExportData) FROM ManuExportData manuExportData WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "manuExportData.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ManuExportData exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ManuExportData exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ManuExportDataPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}