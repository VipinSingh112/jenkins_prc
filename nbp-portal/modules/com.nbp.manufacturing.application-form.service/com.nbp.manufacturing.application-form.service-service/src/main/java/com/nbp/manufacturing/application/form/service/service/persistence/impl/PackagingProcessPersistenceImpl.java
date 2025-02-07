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

import com.nbp.manufacturing.application.form.service.exception.NoSuchPackagingProcessException;
import com.nbp.manufacturing.application.form.service.model.PackagingProcess;
import com.nbp.manufacturing.application.form.service.model.PackagingProcessTable;
import com.nbp.manufacturing.application.form.service.model.impl.PackagingProcessImpl;
import com.nbp.manufacturing.application.form.service.model.impl.PackagingProcessModelImpl;
import com.nbp.manufacturing.application.form.service.service.persistence.PackagingProcessPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.PackagingProcessUtil;
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
 * The persistence implementation for the packaging process service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PackagingProcessPersistence.class)
public class PackagingProcessPersistenceImpl
	extends BasePersistenceImpl<PackagingProcess>
	implements PackagingProcessPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PackagingProcessUtil</code> to access the packaging process persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PackagingProcessImpl.class.getName();

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
	 * Returns the packaging process where manufacturingApplicationId = &#63; or throws a <code>NoSuchPackagingProcessException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching packaging process
	 * @throws NoSuchPackagingProcessException if a matching packaging process could not be found
	 */
	@Override
	public PackagingProcess findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchPackagingProcessException {

		PackagingProcess packagingProcess = fetchBygetManufactureById(
			manufacturingApplicationId);

		if (packagingProcess == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("manufacturingApplicationId=");
			sb.append(manufacturingApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPackagingProcessException(sb.toString());
		}

		return packagingProcess;
	}

	/**
	 * Returns the packaging process where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching packaging process, or <code>null</code> if a matching packaging process could not be found
	 */
	@Override
	public PackagingProcess fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return fetchBygetManufactureById(manufacturingApplicationId, true);
	}

	/**
	 * Returns the packaging process where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching packaging process, or <code>null</code> if a matching packaging process could not be found
	 */
	@Override
	public PackagingProcess fetchBygetManufactureById(
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

		if (result instanceof PackagingProcess) {
			PackagingProcess packagingProcess = (PackagingProcess)result;

			if (manufacturingApplicationId !=
					packagingProcess.getManufacturingApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PACKAGINGPROCESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				List<PackagingProcess> list = query.list();

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
								"PackagingProcessPersistenceImpl.fetchBygetManufactureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PackagingProcess packagingProcess = list.get(0);

					result = packagingProcess;

					cacheResult(packagingProcess);
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
			return (PackagingProcess)result;
		}
	}

	/**
	 * Removes the packaging process where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the packaging process that was removed
	 */
	@Override
	public PackagingProcess removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchPackagingProcessException {

		PackagingProcess packagingProcess = findBygetManufactureById(
			manufacturingApplicationId);

		return remove(packagingProcess);
	}

	/**
	 * Returns the number of packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching packaging processes
	 */
	@Override
	public int countBygetManufactureById(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetManufactureById;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PACKAGINGPROCESS_WHERE);

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
			"packagingProcess.manufacturingApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMA_PP_MAI;
	private FinderPath _finderPathWithoutPaginationFindBygetMA_PP_MAI;
	private FinderPath _finderPathCountBygetMA_PP_MAI;

	/**
	 * Returns all the packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching packaging processes
	 */
	@Override
	public List<PackagingProcess> findBygetMA_PP_MAI(
		long manufacturingApplicationId) {

		return findBygetMA_PP_MAI(
			manufacturingApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @return the range of matching packaging processes
	 */
	@Override
	public List<PackagingProcess> findBygetMA_PP_MAI(
		long manufacturingApplicationId, int start, int end) {

		return findBygetMA_PP_MAI(manufacturingApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching packaging processes
	 */
	@Override
	public List<PackagingProcess> findBygetMA_PP_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<PackagingProcess> orderByComparator) {

		return findBygetMA_PP_MAI(
			manufacturingApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching packaging processes
	 */
	@Override
	public List<PackagingProcess> findBygetMA_PP_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<PackagingProcess> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMA_PP_MAI;
				finderArgs = new Object[] {manufacturingApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMA_PP_MAI;
			finderArgs = new Object[] {
				manufacturingApplicationId, start, end, orderByComparator
			};
		}

		List<PackagingProcess> list = null;

		if (useFinderCache) {
			list = (List<PackagingProcess>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PackagingProcess packagingProcess : list) {
					if (manufacturingApplicationId !=
							packagingProcess.getManufacturingApplicationId()) {

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

			sb.append(_SQL_SELECT_PACKAGINGPROCESS_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_PP_MAI_MANUFACTURINGAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PackagingProcessModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				list = (List<PackagingProcess>)QueryUtil.list(
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
	 * Returns the first packaging process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching packaging process
	 * @throws NoSuchPackagingProcessException if a matching packaging process could not be found
	 */
	@Override
	public PackagingProcess findBygetMA_PP_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<PackagingProcess> orderByComparator)
		throws NoSuchPackagingProcessException {

		PackagingProcess packagingProcess = fetchBygetMA_PP_MAI_First(
			manufacturingApplicationId, orderByComparator);

		if (packagingProcess != null) {
			return packagingProcess;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchPackagingProcessException(sb.toString());
	}

	/**
	 * Returns the first packaging process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching packaging process, or <code>null</code> if a matching packaging process could not be found
	 */
	@Override
	public PackagingProcess fetchBygetMA_PP_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<PackagingProcess> orderByComparator) {

		List<PackagingProcess> list = findBygetMA_PP_MAI(
			manufacturingApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last packaging process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching packaging process
	 * @throws NoSuchPackagingProcessException if a matching packaging process could not be found
	 */
	@Override
	public PackagingProcess findBygetMA_PP_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<PackagingProcess> orderByComparator)
		throws NoSuchPackagingProcessException {

		PackagingProcess packagingProcess = fetchBygetMA_PP_MAI_Last(
			manufacturingApplicationId, orderByComparator);

		if (packagingProcess != null) {
			return packagingProcess;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchPackagingProcessException(sb.toString());
	}

	/**
	 * Returns the last packaging process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching packaging process, or <code>null</code> if a matching packaging process could not be found
	 */
	@Override
	public PackagingProcess fetchBygetMA_PP_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<PackagingProcess> orderByComparator) {

		int count = countBygetMA_PP_MAI(manufacturingApplicationId);

		if (count == 0) {
			return null;
		}

		List<PackagingProcess> list = findBygetMA_PP_MAI(
			manufacturingApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the packaging processes before and after the current packaging process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param packagingProcessId the primary key of the current packaging process
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next packaging process
	 * @throws NoSuchPackagingProcessException if a packaging process with the primary key could not be found
	 */
	@Override
	public PackagingProcess[] findBygetMA_PP_MAI_PrevAndNext(
			long packagingProcessId, long manufacturingApplicationId,
			OrderByComparator<PackagingProcess> orderByComparator)
		throws NoSuchPackagingProcessException {

		PackagingProcess packagingProcess = findByPrimaryKey(
			packagingProcessId);

		Session session = null;

		try {
			session = openSession();

			PackagingProcess[] array = new PackagingProcessImpl[3];

			array[0] = getBygetMA_PP_MAI_PrevAndNext(
				session, packagingProcess, manufacturingApplicationId,
				orderByComparator, true);

			array[1] = packagingProcess;

			array[2] = getBygetMA_PP_MAI_PrevAndNext(
				session, packagingProcess, manufacturingApplicationId,
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

	protected PackagingProcess getBygetMA_PP_MAI_PrevAndNext(
		Session session, PackagingProcess packagingProcess,
		long manufacturingApplicationId,
		OrderByComparator<PackagingProcess> orderByComparator,
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

		sb.append(_SQL_SELECT_PACKAGINGPROCESS_WHERE);

		sb.append(_FINDER_COLUMN_GETMA_PP_MAI_MANUFACTURINGAPPLICATIONID_2);

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
			sb.append(PackagingProcessModelImpl.ORDER_BY_JPQL);
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
						packagingProcess)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PackagingProcess> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the packaging processes where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	@Override
	public void removeBygetMA_PP_MAI(long manufacturingApplicationId) {
		for (PackagingProcess packagingProcess :
				findBygetMA_PP_MAI(
					manufacturingApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(packagingProcess);
		}
	}

	/**
	 * Returns the number of packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching packaging processes
	 */
	@Override
	public int countBygetMA_PP_MAI(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMA_PP_MAI;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PACKAGINGPROCESS_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_PP_MAI_MANUFACTURINGAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETMA_PP_MAI_MANUFACTURINGAPPLICATIONID_2 =
			"packagingProcess.manufacturingApplicationId = ?";

	public PackagingProcessPersistenceImpl() {
		setModelClass(PackagingProcess.class);

		setModelImplClass(PackagingProcessImpl.class);
		setModelPKClass(long.class);

		setTable(PackagingProcessTable.INSTANCE);
	}

	/**
	 * Caches the packaging process in the entity cache if it is enabled.
	 *
	 * @param packagingProcess the packaging process
	 */
	@Override
	public void cacheResult(PackagingProcess packagingProcess) {
		entityCache.putResult(
			PackagingProcessImpl.class, packagingProcess.getPrimaryKey(),
			packagingProcess);

		finderCache.putResult(
			_finderPathFetchBygetManufactureById,
			new Object[] {packagingProcess.getManufacturingApplicationId()},
			packagingProcess);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the packaging processes in the entity cache if it is enabled.
	 *
	 * @param packagingProcesses the packaging processes
	 */
	@Override
	public void cacheResult(List<PackagingProcess> packagingProcesses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (packagingProcesses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PackagingProcess packagingProcess : packagingProcesses) {
			if (entityCache.getResult(
					PackagingProcessImpl.class,
					packagingProcess.getPrimaryKey()) == null) {

				cacheResult(packagingProcess);
			}
		}
	}

	/**
	 * Clears the cache for all packaging processes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PackagingProcessImpl.class);

		finderCache.clearCache(PackagingProcessImpl.class);
	}

	/**
	 * Clears the cache for the packaging process.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PackagingProcess packagingProcess) {
		entityCache.removeResult(PackagingProcessImpl.class, packagingProcess);
	}

	@Override
	public void clearCache(List<PackagingProcess> packagingProcesses) {
		for (PackagingProcess packagingProcess : packagingProcesses) {
			entityCache.removeResult(
				PackagingProcessImpl.class, packagingProcess);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PackagingProcessImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(PackagingProcessImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PackagingProcessModelImpl packagingProcessModelImpl) {

		Object[] args = new Object[] {
			packagingProcessModelImpl.getManufacturingApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetManufactureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManufactureById, args,
			packagingProcessModelImpl);
	}

	/**
	 * Creates a new packaging process with the primary key. Does not add the packaging process to the database.
	 *
	 * @param packagingProcessId the primary key for the new packaging process
	 * @return the new packaging process
	 */
	@Override
	public PackagingProcess create(long packagingProcessId) {
		PackagingProcess packagingProcess = new PackagingProcessImpl();

		packagingProcess.setNew(true);
		packagingProcess.setPrimaryKey(packagingProcessId);

		packagingProcess.setCompanyId(CompanyThreadLocal.getCompanyId());

		return packagingProcess;
	}

	/**
	 * Removes the packaging process with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param packagingProcessId the primary key of the packaging process
	 * @return the packaging process that was removed
	 * @throws NoSuchPackagingProcessException if a packaging process with the primary key could not be found
	 */
	@Override
	public PackagingProcess remove(long packagingProcessId)
		throws NoSuchPackagingProcessException {

		return remove((Serializable)packagingProcessId);
	}

	/**
	 * Removes the packaging process with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the packaging process
	 * @return the packaging process that was removed
	 * @throws NoSuchPackagingProcessException if a packaging process with the primary key could not be found
	 */
	@Override
	public PackagingProcess remove(Serializable primaryKey)
		throws NoSuchPackagingProcessException {

		Session session = null;

		try {
			session = openSession();

			PackagingProcess packagingProcess = (PackagingProcess)session.get(
				PackagingProcessImpl.class, primaryKey);

			if (packagingProcess == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPackagingProcessException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(packagingProcess);
		}
		catch (NoSuchPackagingProcessException noSuchEntityException) {
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
	protected PackagingProcess removeImpl(PackagingProcess packagingProcess) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(packagingProcess)) {
				packagingProcess = (PackagingProcess)session.get(
					PackagingProcessImpl.class,
					packagingProcess.getPrimaryKeyObj());
			}

			if (packagingProcess != null) {
				session.delete(packagingProcess);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (packagingProcess != null) {
			clearCache(packagingProcess);
		}

		return packagingProcess;
	}

	@Override
	public PackagingProcess updateImpl(PackagingProcess packagingProcess) {
		boolean isNew = packagingProcess.isNew();

		if (!(packagingProcess instanceof PackagingProcessModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(packagingProcess.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					packagingProcess);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in packagingProcess proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PackagingProcess implementation " +
					packagingProcess.getClass());
		}

		PackagingProcessModelImpl packagingProcessModelImpl =
			(PackagingProcessModelImpl)packagingProcess;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (packagingProcess.getCreateDate() == null)) {
			if (serviceContext == null) {
				packagingProcess.setCreateDate(date);
			}
			else {
				packagingProcess.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!packagingProcessModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				packagingProcess.setModifiedDate(date);
			}
			else {
				packagingProcess.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(packagingProcess);
			}
			else {
				packagingProcess = (PackagingProcess)session.merge(
					packagingProcess);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PackagingProcessImpl.class, packagingProcessModelImpl, false, true);

		cacheUniqueFindersCache(packagingProcessModelImpl);

		if (isNew) {
			packagingProcess.setNew(false);
		}

		packagingProcess.resetOriginalValues();

		return packagingProcess;
	}

	/**
	 * Returns the packaging process with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the packaging process
	 * @return the packaging process
	 * @throws NoSuchPackagingProcessException if a packaging process with the primary key could not be found
	 */
	@Override
	public PackagingProcess findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPackagingProcessException {

		PackagingProcess packagingProcess = fetchByPrimaryKey(primaryKey);

		if (packagingProcess == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPackagingProcessException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return packagingProcess;
	}

	/**
	 * Returns the packaging process with the primary key or throws a <code>NoSuchPackagingProcessException</code> if it could not be found.
	 *
	 * @param packagingProcessId the primary key of the packaging process
	 * @return the packaging process
	 * @throws NoSuchPackagingProcessException if a packaging process with the primary key could not be found
	 */
	@Override
	public PackagingProcess findByPrimaryKey(long packagingProcessId)
		throws NoSuchPackagingProcessException {

		return findByPrimaryKey((Serializable)packagingProcessId);
	}

	/**
	 * Returns the packaging process with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param packagingProcessId the primary key of the packaging process
	 * @return the packaging process, or <code>null</code> if a packaging process with the primary key could not be found
	 */
	@Override
	public PackagingProcess fetchByPrimaryKey(long packagingProcessId) {
		return fetchByPrimaryKey((Serializable)packagingProcessId);
	}

	/**
	 * Returns all the packaging processes.
	 *
	 * @return the packaging processes
	 */
	@Override
	public List<PackagingProcess> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the packaging processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @return the range of packaging processes
	 */
	@Override
	public List<PackagingProcess> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the packaging processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of packaging processes
	 */
	@Override
	public List<PackagingProcess> findAll(
		int start, int end,
		OrderByComparator<PackagingProcess> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the packaging processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of packaging processes
	 */
	@Override
	public List<PackagingProcess> findAll(
		int start, int end,
		OrderByComparator<PackagingProcess> orderByComparator,
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

		List<PackagingProcess> list = null;

		if (useFinderCache) {
			list = (List<PackagingProcess>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PACKAGINGPROCESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PACKAGINGPROCESS;

				sql = sql.concat(PackagingProcessModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PackagingProcess>)QueryUtil.list(
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
	 * Removes all the packaging processes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PackagingProcess packagingProcess : findAll()) {
			remove(packagingProcess);
		}
	}

	/**
	 * Returns the number of packaging processes.
	 *
	 * @return the number of packaging processes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PACKAGINGPROCESS);

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
		return "packagingProcessId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PACKAGINGPROCESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PackagingProcessModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the packaging process persistence.
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

		_finderPathWithPaginationFindBygetMA_PP_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMA_PP_MAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMA_PP_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMA_PP_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetMA_PP_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMA_PP_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		PackagingProcessUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PackagingProcessUtil.setPersistence(null);

		entityCache.removeCache(PackagingProcessImpl.class.getName());
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

	private static final String _SQL_SELECT_PACKAGINGPROCESS =
		"SELECT packagingProcess FROM PackagingProcess packagingProcess";

	private static final String _SQL_SELECT_PACKAGINGPROCESS_WHERE =
		"SELECT packagingProcess FROM PackagingProcess packagingProcess WHERE ";

	private static final String _SQL_COUNT_PACKAGINGPROCESS =
		"SELECT COUNT(packagingProcess) FROM PackagingProcess packagingProcess";

	private static final String _SQL_COUNT_PACKAGINGPROCESS_WHERE =
		"SELECT COUNT(packagingProcess) FROM PackagingProcess packagingProcess WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "packagingProcess.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PackagingProcess exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PackagingProcess exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PackagingProcessPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}