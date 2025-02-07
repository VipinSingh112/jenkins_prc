/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence.impl;

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

import com.nbp.ncra.application.form.service.exception.NoSuchNcraVerifyWeighingDeviceInfoException;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfoTable;
import com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDeviceInfoImpl;
import com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDeviceInfoModelImpl;
import com.nbp.ncra.application.form.service.service.persistence.NcraVerifyWeighingDeviceInfoPersistence;
import com.nbp.ncra.application.form.service.service.persistence.NcraVerifyWeighingDeviceInfoUtil;
import com.nbp.ncra.application.form.service.service.persistence.impl.constants.NCRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the ncra verify weighing device info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcraVerifyWeighingDeviceInfoPersistence.class)
public class NcraVerifyWeighingDeviceInfoPersistenceImpl
	extends BasePersistenceImpl<NcraVerifyWeighingDeviceInfo>
	implements NcraVerifyWeighingDeviceInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcraVerifyWeighingDeviceInfoUtil</code> to access the ncra verify weighing device info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcraVerifyWeighingDeviceInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNcraVerify_By_NCRA_Id;
	private FinderPath _finderPathCountBygetNcraVerify_By_NCRA_Id;

	/**
	 * Returns the ncra verify weighing device info where ncraApplicationId = &#63; or throws a <code>NoSuchNcraVerifyWeighingDeviceInfoException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra verify weighing device info
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a matching ncra verify weighing device info could not be found
	 */
	@Override
	public NcraVerifyWeighingDeviceInfo findBygetNcraVerify_By_NCRA_Id(
			long ncraApplicationId)
		throws NoSuchNcraVerifyWeighingDeviceInfoException {

		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo =
			fetchBygetNcraVerify_By_NCRA_Id(ncraApplicationId);

		if (ncraVerifyWeighingDeviceInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncraApplicationId=");
			sb.append(ncraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcraVerifyWeighingDeviceInfoException(
				sb.toString());
		}

		return ncraVerifyWeighingDeviceInfo;
	}

	/**
	 * Returns the ncra verify weighing device info where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra verify weighing device info, or <code>null</code> if a matching ncra verify weighing device info could not be found
	 */
	@Override
	public NcraVerifyWeighingDeviceInfo fetchBygetNcraVerify_By_NCRA_Id(
		long ncraApplicationId) {

		return fetchBygetNcraVerify_By_NCRA_Id(ncraApplicationId, true);
	}

	/**
	 * Returns the ncra verify weighing device info where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra verify weighing device info, or <code>null</code> if a matching ncra verify weighing device info could not be found
	 */
	@Override
	public NcraVerifyWeighingDeviceInfo fetchBygetNcraVerify_By_NCRA_Id(
		long ncraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ncraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcraVerify_By_NCRA_Id, finderArgs, this);
		}

		if (result instanceof NcraVerifyWeighingDeviceInfo) {
			NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo =
				(NcraVerifyWeighingDeviceInfo)result;

			if (ncraApplicationId !=
					ncraVerifyWeighingDeviceInfo.getNcraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCRAVERIFYWEIGHINGDEVICEINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETNCRAVERIFY_BY_NCRA_ID_NCRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncraApplicationId);

				List<NcraVerifyWeighingDeviceInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcraVerify_By_NCRA_Id,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ncraApplicationId};
							}

							_log.warn(
								"NcraVerifyWeighingDeviceInfoPersistenceImpl.fetchBygetNcraVerify_By_NCRA_Id(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo =
						list.get(0);

					result = ncraVerifyWeighingDeviceInfo;

					cacheResult(ncraVerifyWeighingDeviceInfo);
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
			return (NcraVerifyWeighingDeviceInfo)result;
		}
	}

	/**
	 * Removes the ncra verify weighing device info where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra verify weighing device info that was removed
	 */
	@Override
	public NcraVerifyWeighingDeviceInfo removeBygetNcraVerify_By_NCRA_Id(
			long ncraApplicationId)
		throws NoSuchNcraVerifyWeighingDeviceInfoException {

		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo =
			findBygetNcraVerify_By_NCRA_Id(ncraApplicationId);

		return remove(ncraVerifyWeighingDeviceInfo);
	}

	/**
	 * Returns the number of ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra verify weighing device infos
	 */
	@Override
	public int countBygetNcraVerify_By_NCRA_Id(long ncraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNcraVerify_By_NCRA_Id;

		Object[] finderArgs = new Object[] {ncraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAVERIFYWEIGHINGDEVICEINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETNCRAVERIFY_BY_NCRA_ID_NCRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncraApplicationId);

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
		_FINDER_COLUMN_GETNCRAVERIFY_BY_NCRA_ID_NCRAAPPLICATIONID_2 =
			"ncraVerifyWeighingDeviceInfo.ncraApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetNcraVerify_By_DataList;
	private FinderPath
		_finderPathWithoutPaginationFindBygetNcraVerify_By_DataList;
	private FinderPath _finderPathCountBygetNcraVerify_By_DataList;

	/**
	 * Returns all the ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra verify weighing device infos
	 */
	@Override
	public List<NcraVerifyWeighingDeviceInfo> findBygetNcraVerify_By_DataList(
		long ncraApplicationId) {

		return findBygetNcraVerify_By_DataList(
			ncraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @return the range of matching ncra verify weighing device infos
	 */
	@Override
	public List<NcraVerifyWeighingDeviceInfo> findBygetNcraVerify_By_DataList(
		long ncraApplicationId, int start, int end) {

		return findBygetNcraVerify_By_DataList(
			ncraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra verify weighing device infos
	 */
	@Override
	public List<NcraVerifyWeighingDeviceInfo> findBygetNcraVerify_By_DataList(
		long ncraApplicationId, int start, int end,
		OrderByComparator<NcraVerifyWeighingDeviceInfo> orderByComparator) {

		return findBygetNcraVerify_By_DataList(
			ncraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra verify weighing device infos
	 */
	@Override
	public List<NcraVerifyWeighingDeviceInfo> findBygetNcraVerify_By_DataList(
		long ncraApplicationId, int start, int end,
		OrderByComparator<NcraVerifyWeighingDeviceInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetNcraVerify_By_DataList;
				finderArgs = new Object[] {ncraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetNcraVerify_By_DataList;
			finderArgs = new Object[] {
				ncraApplicationId, start, end, orderByComparator
			};
		}

		List<NcraVerifyWeighingDeviceInfo> list = null;

		if (useFinderCache) {
			list = (List<NcraVerifyWeighingDeviceInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo :
						list) {

					if (ncraApplicationId !=
							ncraVerifyWeighingDeviceInfo.
								getNcraApplicationId()) {

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

			sb.append(_SQL_SELECT_NCRAVERIFYWEIGHINGDEVICEINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETNCRAVERIFY_BY_DATALIST_NCRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcraVerifyWeighingDeviceInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncraApplicationId);

				list = (List<NcraVerifyWeighingDeviceInfo>)QueryUtil.list(
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
	 * Returns the first ncra verify weighing device info in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra verify weighing device info
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a matching ncra verify weighing device info could not be found
	 */
	@Override
	public NcraVerifyWeighingDeviceInfo findBygetNcraVerify_By_DataList_First(
			long ncraApplicationId,
			OrderByComparator<NcraVerifyWeighingDeviceInfo> orderByComparator)
		throws NoSuchNcraVerifyWeighingDeviceInfoException {

		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo =
			fetchBygetNcraVerify_By_DataList_First(
				ncraApplicationId, orderByComparator);

		if (ncraVerifyWeighingDeviceInfo != null) {
			return ncraVerifyWeighingDeviceInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncraApplicationId=");
		sb.append(ncraApplicationId);

		sb.append("}");

		throw new NoSuchNcraVerifyWeighingDeviceInfoException(sb.toString());
	}

	/**
	 * Returns the first ncra verify weighing device info in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra verify weighing device info, or <code>null</code> if a matching ncra verify weighing device info could not be found
	 */
	@Override
	public NcraVerifyWeighingDeviceInfo fetchBygetNcraVerify_By_DataList_First(
		long ncraApplicationId,
		OrderByComparator<NcraVerifyWeighingDeviceInfo> orderByComparator) {

		List<NcraVerifyWeighingDeviceInfo> list =
			findBygetNcraVerify_By_DataList(
				ncraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncra verify weighing device info in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra verify weighing device info
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a matching ncra verify weighing device info could not be found
	 */
	@Override
	public NcraVerifyWeighingDeviceInfo findBygetNcraVerify_By_DataList_Last(
			long ncraApplicationId,
			OrderByComparator<NcraVerifyWeighingDeviceInfo> orderByComparator)
		throws NoSuchNcraVerifyWeighingDeviceInfoException {

		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo =
			fetchBygetNcraVerify_By_DataList_Last(
				ncraApplicationId, orderByComparator);

		if (ncraVerifyWeighingDeviceInfo != null) {
			return ncraVerifyWeighingDeviceInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncraApplicationId=");
		sb.append(ncraApplicationId);

		sb.append("}");

		throw new NoSuchNcraVerifyWeighingDeviceInfoException(sb.toString());
	}

	/**
	 * Returns the last ncra verify weighing device info in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra verify weighing device info, or <code>null</code> if a matching ncra verify weighing device info could not be found
	 */
	@Override
	public NcraVerifyWeighingDeviceInfo fetchBygetNcraVerify_By_DataList_Last(
		long ncraApplicationId,
		OrderByComparator<NcraVerifyWeighingDeviceInfo> orderByComparator) {

		int count = countBygetNcraVerify_By_DataList(ncraApplicationId);

		if (count == 0) {
			return null;
		}

		List<NcraVerifyWeighingDeviceInfo> list =
			findBygetNcraVerify_By_DataList(
				ncraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncra verify weighing device infos before and after the current ncra verify weighing device info in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key of the current ncra verify weighing device info
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra verify weighing device info
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a ncra verify weighing device info with the primary key could not be found
	 */
	@Override
	public NcraVerifyWeighingDeviceInfo[]
			findBygetNcraVerify_By_DataList_PrevAndNext(
				long ncraVerifyWeighingDeviceInfoId, long ncraApplicationId,
				OrderByComparator<NcraVerifyWeighingDeviceInfo>
					orderByComparator)
		throws NoSuchNcraVerifyWeighingDeviceInfoException {

		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo =
			findByPrimaryKey(ncraVerifyWeighingDeviceInfoId);

		Session session = null;

		try {
			session = openSession();

			NcraVerifyWeighingDeviceInfo[] array =
				new NcraVerifyWeighingDeviceInfoImpl[3];

			array[0] = getBygetNcraVerify_By_DataList_PrevAndNext(
				session, ncraVerifyWeighingDeviceInfo, ncraApplicationId,
				orderByComparator, true);

			array[1] = ncraVerifyWeighingDeviceInfo;

			array[2] = getBygetNcraVerify_By_DataList_PrevAndNext(
				session, ncraVerifyWeighingDeviceInfo, ncraApplicationId,
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

	protected NcraVerifyWeighingDeviceInfo
		getBygetNcraVerify_By_DataList_PrevAndNext(
			Session session,
			NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo,
			long ncraApplicationId,
			OrderByComparator<NcraVerifyWeighingDeviceInfo> orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_NCRAVERIFYWEIGHINGDEVICEINFO_WHERE);

		sb.append(_FINDER_COLUMN_GETNCRAVERIFY_BY_DATALIST_NCRAAPPLICATIONID_2);

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
			sb.append(NcraVerifyWeighingDeviceInfoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(ncraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						ncraVerifyWeighingDeviceInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcraVerifyWeighingDeviceInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncra verify weighing device infos where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 */
	@Override
	public void removeBygetNcraVerify_By_DataList(long ncraApplicationId) {
		for (NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo :
				findBygetNcraVerify_By_DataList(
					ncraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncraVerifyWeighingDeviceInfo);
		}
	}

	/**
	 * Returns the number of ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra verify weighing device infos
	 */
	@Override
	public int countBygetNcraVerify_By_DataList(long ncraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNcraVerify_By_DataList;

		Object[] finderArgs = new Object[] {ncraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAVERIFYWEIGHINGDEVICEINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETNCRAVERIFY_BY_DATALIST_NCRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncraApplicationId);

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
		_FINDER_COLUMN_GETNCRAVERIFY_BY_DATALIST_NCRAAPPLICATIONID_2 =
			"ncraVerifyWeighingDeviceInfo.ncraApplicationId = ?";

	public NcraVerifyWeighingDeviceInfoPersistenceImpl() {
		setModelClass(NcraVerifyWeighingDeviceInfo.class);

		setModelImplClass(NcraVerifyWeighingDeviceInfoImpl.class);
		setModelPKClass(long.class);

		setTable(NcraVerifyWeighingDeviceInfoTable.INSTANCE);
	}

	/**
	 * Caches the ncra verify weighing device info in the entity cache if it is enabled.
	 *
	 * @param ncraVerifyWeighingDeviceInfo the ncra verify weighing device info
	 */
	@Override
	public void cacheResult(
		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo) {

		entityCache.putResult(
			NcraVerifyWeighingDeviceInfoImpl.class,
			ncraVerifyWeighingDeviceInfo.getPrimaryKey(),
			ncraVerifyWeighingDeviceInfo);

		finderCache.putResult(
			_finderPathFetchBygetNcraVerify_By_NCRA_Id,
			new Object[] {ncraVerifyWeighingDeviceInfo.getNcraApplicationId()},
			ncraVerifyWeighingDeviceInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncra verify weighing device infos in the entity cache if it is enabled.
	 *
	 * @param ncraVerifyWeighingDeviceInfos the ncra verify weighing device infos
	 */
	@Override
	public void cacheResult(
		List<NcraVerifyWeighingDeviceInfo> ncraVerifyWeighingDeviceInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncraVerifyWeighingDeviceInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo :
				ncraVerifyWeighingDeviceInfos) {

			if (entityCache.getResult(
					NcraVerifyWeighingDeviceInfoImpl.class,
					ncraVerifyWeighingDeviceInfo.getPrimaryKey()) == null) {

				cacheResult(ncraVerifyWeighingDeviceInfo);
			}
		}
	}

	/**
	 * Clears the cache for all ncra verify weighing device infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcraVerifyWeighingDeviceInfoImpl.class);

		finderCache.clearCache(NcraVerifyWeighingDeviceInfoImpl.class);
	}

	/**
	 * Clears the cache for the ncra verify weighing device info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo) {

		entityCache.removeResult(
			NcraVerifyWeighingDeviceInfoImpl.class,
			ncraVerifyWeighingDeviceInfo);
	}

	@Override
	public void clearCache(
		List<NcraVerifyWeighingDeviceInfo> ncraVerifyWeighingDeviceInfos) {

		for (NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo :
				ncraVerifyWeighingDeviceInfos) {

			entityCache.removeResult(
				NcraVerifyWeighingDeviceInfoImpl.class,
				ncraVerifyWeighingDeviceInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcraVerifyWeighingDeviceInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcraVerifyWeighingDeviceInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcraVerifyWeighingDeviceInfoModelImpl
			ncraVerifyWeighingDeviceInfoModelImpl) {

		Object[] args = new Object[] {
			ncraVerifyWeighingDeviceInfoModelImpl.getNcraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNcraVerify_By_NCRA_Id, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcraVerify_By_NCRA_Id, args,
			ncraVerifyWeighingDeviceInfoModelImpl);
	}

	/**
	 * Creates a new ncra verify weighing device info with the primary key. Does not add the ncra verify weighing device info to the database.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key for the new ncra verify weighing device info
	 * @return the new ncra verify weighing device info
	 */
	@Override
	public NcraVerifyWeighingDeviceInfo create(
		long ncraVerifyWeighingDeviceInfoId) {

		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo =
			new NcraVerifyWeighingDeviceInfoImpl();

		ncraVerifyWeighingDeviceInfo.setNew(true);
		ncraVerifyWeighingDeviceInfo.setPrimaryKey(
			ncraVerifyWeighingDeviceInfoId);

		ncraVerifyWeighingDeviceInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return ncraVerifyWeighingDeviceInfo;
	}

	/**
	 * Removes the ncra verify weighing device info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key of the ncra verify weighing device info
	 * @return the ncra verify weighing device info that was removed
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a ncra verify weighing device info with the primary key could not be found
	 */
	@Override
	public NcraVerifyWeighingDeviceInfo remove(
			long ncraVerifyWeighingDeviceInfoId)
		throws NoSuchNcraVerifyWeighingDeviceInfoException {

		return remove((Serializable)ncraVerifyWeighingDeviceInfoId);
	}

	/**
	 * Removes the ncra verify weighing device info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncra verify weighing device info
	 * @return the ncra verify weighing device info that was removed
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a ncra verify weighing device info with the primary key could not be found
	 */
	@Override
	public NcraVerifyWeighingDeviceInfo remove(Serializable primaryKey)
		throws NoSuchNcraVerifyWeighingDeviceInfoException {

		Session session = null;

		try {
			session = openSession();

			NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo =
				(NcraVerifyWeighingDeviceInfo)session.get(
					NcraVerifyWeighingDeviceInfoImpl.class, primaryKey);

			if (ncraVerifyWeighingDeviceInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcraVerifyWeighingDeviceInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncraVerifyWeighingDeviceInfo);
		}
		catch (NoSuchNcraVerifyWeighingDeviceInfoException
					noSuchEntityException) {

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
	protected NcraVerifyWeighingDeviceInfo removeImpl(
		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncraVerifyWeighingDeviceInfo)) {
				ncraVerifyWeighingDeviceInfo =
					(NcraVerifyWeighingDeviceInfo)session.get(
						NcraVerifyWeighingDeviceInfoImpl.class,
						ncraVerifyWeighingDeviceInfo.getPrimaryKeyObj());
			}

			if (ncraVerifyWeighingDeviceInfo != null) {
				session.delete(ncraVerifyWeighingDeviceInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncraVerifyWeighingDeviceInfo != null) {
			clearCache(ncraVerifyWeighingDeviceInfo);
		}

		return ncraVerifyWeighingDeviceInfo;
	}

	@Override
	public NcraVerifyWeighingDeviceInfo updateImpl(
		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo) {

		boolean isNew = ncraVerifyWeighingDeviceInfo.isNew();

		if (!(ncraVerifyWeighingDeviceInfo instanceof
				NcraVerifyWeighingDeviceInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					ncraVerifyWeighingDeviceInfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					ncraVerifyWeighingDeviceInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncraVerifyWeighingDeviceInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcraVerifyWeighingDeviceInfo implementation " +
					ncraVerifyWeighingDeviceInfo.getClass());
		}

		NcraVerifyWeighingDeviceInfoModelImpl
			ncraVerifyWeighingDeviceInfoModelImpl =
				(NcraVerifyWeighingDeviceInfoModelImpl)
					ncraVerifyWeighingDeviceInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncraVerifyWeighingDeviceInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncraVerifyWeighingDeviceInfo.setCreateDate(date);
			}
			else {
				ncraVerifyWeighingDeviceInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncraVerifyWeighingDeviceInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncraVerifyWeighingDeviceInfo.setModifiedDate(date);
			}
			else {
				ncraVerifyWeighingDeviceInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncraVerifyWeighingDeviceInfo);
			}
			else {
				ncraVerifyWeighingDeviceInfo =
					(NcraVerifyWeighingDeviceInfo)session.merge(
						ncraVerifyWeighingDeviceInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcraVerifyWeighingDeviceInfoImpl.class,
			ncraVerifyWeighingDeviceInfoModelImpl, false, true);

		cacheUniqueFindersCache(ncraVerifyWeighingDeviceInfoModelImpl);

		if (isNew) {
			ncraVerifyWeighingDeviceInfo.setNew(false);
		}

		ncraVerifyWeighingDeviceInfo.resetOriginalValues();

		return ncraVerifyWeighingDeviceInfo;
	}

	/**
	 * Returns the ncra verify weighing device info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncra verify weighing device info
	 * @return the ncra verify weighing device info
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a ncra verify weighing device info with the primary key could not be found
	 */
	@Override
	public NcraVerifyWeighingDeviceInfo findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchNcraVerifyWeighingDeviceInfoException {

		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo =
			fetchByPrimaryKey(primaryKey);

		if (ncraVerifyWeighingDeviceInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcraVerifyWeighingDeviceInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncraVerifyWeighingDeviceInfo;
	}

	/**
	 * Returns the ncra verify weighing device info with the primary key or throws a <code>NoSuchNcraVerifyWeighingDeviceInfoException</code> if it could not be found.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key of the ncra verify weighing device info
	 * @return the ncra verify weighing device info
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a ncra verify weighing device info with the primary key could not be found
	 */
	@Override
	public NcraVerifyWeighingDeviceInfo findByPrimaryKey(
			long ncraVerifyWeighingDeviceInfoId)
		throws NoSuchNcraVerifyWeighingDeviceInfoException {

		return findByPrimaryKey((Serializable)ncraVerifyWeighingDeviceInfoId);
	}

	/**
	 * Returns the ncra verify weighing device info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key of the ncra verify weighing device info
	 * @return the ncra verify weighing device info, or <code>null</code> if a ncra verify weighing device info with the primary key could not be found
	 */
	@Override
	public NcraVerifyWeighingDeviceInfo fetchByPrimaryKey(
		long ncraVerifyWeighingDeviceInfoId) {

		return fetchByPrimaryKey((Serializable)ncraVerifyWeighingDeviceInfoId);
	}

	/**
	 * Returns all the ncra verify weighing device infos.
	 *
	 * @return the ncra verify weighing device infos
	 */
	@Override
	public List<NcraVerifyWeighingDeviceInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra verify weighing device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @return the range of ncra verify weighing device infos
	 */
	@Override
	public List<NcraVerifyWeighingDeviceInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra verify weighing device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra verify weighing device infos
	 */
	@Override
	public List<NcraVerifyWeighingDeviceInfo> findAll(
		int start, int end,
		OrderByComparator<NcraVerifyWeighingDeviceInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra verify weighing device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra verify weighing device infos
	 */
	@Override
	public List<NcraVerifyWeighingDeviceInfo> findAll(
		int start, int end,
		OrderByComparator<NcraVerifyWeighingDeviceInfo> orderByComparator,
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

		List<NcraVerifyWeighingDeviceInfo> list = null;

		if (useFinderCache) {
			list = (List<NcraVerifyWeighingDeviceInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCRAVERIFYWEIGHINGDEVICEINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCRAVERIFYWEIGHINGDEVICEINFO;

				sql = sql.concat(
					NcraVerifyWeighingDeviceInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcraVerifyWeighingDeviceInfo>)QueryUtil.list(
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
	 * Removes all the ncra verify weighing device infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo :
				findAll()) {

			remove(ncraVerifyWeighingDeviceInfo);
		}
	}

	/**
	 * Returns the number of ncra verify weighing device infos.
	 *
	 * @return the number of ncra verify weighing device infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_NCRAVERIFYWEIGHINGDEVICEINFO);

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
		return "ncraVerifyWeighingDeviceInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCRAVERIFYWEIGHINGDEVICEINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcraVerifyWeighingDeviceInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncra verify weighing device info persistence.
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

		_finderPathFetchBygetNcraVerify_By_NCRA_Id = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcraVerify_By_NCRA_Id",
			new String[] {Long.class.getName()},
			new String[] {"ncraApplicationId"}, true);

		_finderPathCountBygetNcraVerify_By_NCRA_Id = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcraVerify_By_NCRA_Id",
			new String[] {Long.class.getName()},
			new String[] {"ncraApplicationId"}, false);

		_finderPathWithPaginationFindBygetNcraVerify_By_DataList =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetNcraVerify_By_DataList",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"ncraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetNcraVerify_By_DataList =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetNcraVerify_By_DataList",
				new String[] {Long.class.getName()},
				new String[] {"ncraApplicationId"}, true);

		_finderPathCountBygetNcraVerify_By_DataList = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcraVerify_By_DataList",
			new String[] {Long.class.getName()},
			new String[] {"ncraApplicationId"}, false);

		NcraVerifyWeighingDeviceInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcraVerifyWeighingDeviceInfoUtil.setPersistence(null);

		entityCache.removeCache(
			NcraVerifyWeighingDeviceInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCRAVERIFYWEIGHINGDEVICEINFO =
		"SELECT ncraVerifyWeighingDeviceInfo FROM NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo";

	private static final String _SQL_SELECT_NCRAVERIFYWEIGHINGDEVICEINFO_WHERE =
		"SELECT ncraVerifyWeighingDeviceInfo FROM NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo WHERE ";

	private static final String _SQL_COUNT_NCRAVERIFYWEIGHINGDEVICEINFO =
		"SELECT COUNT(ncraVerifyWeighingDeviceInfo) FROM NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo";

	private static final String _SQL_COUNT_NCRAVERIFYWEIGHINGDEVICEINFO_WHERE =
		"SELECT COUNT(ncraVerifyWeighingDeviceInfo) FROM NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncraVerifyWeighingDeviceInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcraVerifyWeighingDeviceInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcraVerifyWeighingDeviceInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcraVerifyWeighingDeviceInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}