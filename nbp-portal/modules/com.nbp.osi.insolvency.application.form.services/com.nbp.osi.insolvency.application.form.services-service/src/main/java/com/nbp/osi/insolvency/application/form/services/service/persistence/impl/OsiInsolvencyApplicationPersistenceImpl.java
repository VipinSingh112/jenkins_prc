/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiInsolvencyApplicationException;
import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplication;
import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplicationTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyApplicationImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyApplicationModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiInsolvencyApplicationPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiInsolvencyApplicationUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the osi insolvency application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiInsolvencyApplicationPersistence.class)
public class OsiInsolvencyApplicationPersistenceImpl
	extends BasePersistenceImpl<OsiInsolvencyApplication>
	implements OsiInsolvencyApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiInsolvencyApplicationUtil</code> to access the osi insolvency application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiInsolvencyApplicationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOsiInsolvencyById;
	private FinderPath _finderPathCountBygetOsiInsolvencyById;

	/**
	 * Returns the osi insolvency application where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication findBygetOsiInsolvencyById(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication =
			fetchBygetOsiInsolvencyById(osiInsolvencyId);

		if (osiInsolvencyApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiInsolvencyApplicationException(sb.toString());
		}

		return osiInsolvencyApplication;
	}

	/**
	 * Returns the osi insolvency application where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication fetchBygetOsiInsolvencyById(
		long osiInsolvencyId) {

		return fetchBygetOsiInsolvencyById(osiInsolvencyId, true);
	}

	/**
	 * Returns the osi insolvency application where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication fetchBygetOsiInsolvencyById(
		long osiInsolvencyId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiInsolvencyId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiInsolvencyById, finderArgs, this);
		}

		if (result instanceof OsiInsolvencyApplication) {
			OsiInsolvencyApplication osiInsolvencyApplication =
				(OsiInsolvencyApplication)result;

			if (osiInsolvencyId !=
					osiInsolvencyApplication.getOsiInsolvencyId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIINSOLVENCYBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<OsiInsolvencyApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiInsolvencyById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {osiInsolvencyId};
							}

							_log.warn(
								"OsiInsolvencyApplicationPersistenceImpl.fetchBygetOsiInsolvencyById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiInsolvencyApplication osiInsolvencyApplication =
						list.get(0);

					result = osiInsolvencyApplication;

					cacheResult(osiInsolvencyApplication);
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
			return (OsiInsolvencyApplication)result;
		}
	}

	/**
	 * Removes the osi insolvency application where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi insolvency application that was removed
	 */
	@Override
	public OsiInsolvencyApplication removeBygetOsiInsolvencyById(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication =
			findBygetOsiInsolvencyById(osiInsolvencyId);

		return remove(osiInsolvencyApplication);
	}

	/**
	 * Returns the number of osi insolvency applications where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolvency applications
	 */
	@Override
	public int countBygetOsiInsolvencyById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiInsolvencyById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIINSOLVENCYBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

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
		_FINDER_COLUMN_GETOSIINSOLVENCYBYID_OSIINSOLVENCYID_2 =
			"osiInsolvencyApplication.osiInsolvencyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetOsiByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetOsiByS_U;
	private FinderPath _finderPathCountBygetOsiByS_U;

	/**
	 * Returns all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication> findBygetOsiByS_U(
		long userId, int status) {

		return findBygetOsiByS_U(
			userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @return the range of matching osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end) {

		return findBygetOsiByS_U(userId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return findBygetOsiByS_U(
			userId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOsiByS_U;
				finderArgs = new Object[] {userId, status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOsiByS_U;
			finderArgs = new Object[] {
				userId, status, start, end, orderByComparator
			};
		}

		List<OsiInsolvencyApplication> list = null;

		if (useFinderCache) {
			list = (List<OsiInsolvencyApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiInsolvencyApplication osiInsolvencyApplication : list) {
					if ((userId != osiInsolvencyApplication.getUserId()) ||
						(status != osiInsolvencyApplication.getStatus())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETOSIBYS_U_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiInsolvencyApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				queryPos.add(status);

				list = (List<OsiInsolvencyApplication>)QueryUtil.list(
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
	 * Returns the first osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication findBygetOsiByS_U_First(
			long userId, int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication =
			fetchBygetOsiByS_U_First(userId, status, orderByComparator);

		if (osiInsolvencyApplication != null) {
			return osiInsolvencyApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationException(sb.toString());
	}

	/**
	 * Returns the first osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication fetchBygetOsiByS_U_First(
		long userId, int status,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		List<OsiInsolvencyApplication> list = findBygetOsiByS_U(
			userId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication findBygetOsiByS_U_Last(
			long userId, int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication =
			fetchBygetOsiByS_U_Last(userId, status, orderByComparator);

		if (osiInsolvencyApplication != null) {
			return osiInsolvencyApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationException(sb.toString());
	}

	/**
	 * Returns the last osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication fetchBygetOsiByS_U_Last(
		long userId, int status,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		int count = countBygetOsiByS_U(userId, status);

		if (count == 0) {
			return null;
		}

		List<OsiInsolvencyApplication> list = findBygetOsiByS_U(
			userId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi insolvency applications before and after the current osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param osiInsolvencyId the primary key of the current osi insolvency application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplication[] findBygetOsiByS_U_PrevAndNext(
			long osiInsolvencyId, long userId, int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication = findByPrimaryKey(
			osiInsolvencyId);

		Session session = null;

		try {
			session = openSession();

			OsiInsolvencyApplication[] array =
				new OsiInsolvencyApplicationImpl[3];

			array[0] = getBygetOsiByS_U_PrevAndNext(
				session, osiInsolvencyApplication, userId, status,
				orderByComparator, true);

			array[1] = osiInsolvencyApplication;

			array[2] = getBygetOsiByS_U_PrevAndNext(
				session, osiInsolvencyApplication, userId, status,
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

	protected OsiInsolvencyApplication getBygetOsiByS_U_PrevAndNext(
		Session session, OsiInsolvencyApplication osiInsolvencyApplication,
		long userId, int status,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIBYS_U_USERID_2);

		sb.append(_FINDER_COLUMN_GETOSIBYS_U_STATUS_2);

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
			sb.append(OsiInsolvencyApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(userId);

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						osiInsolvencyApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiInsolvencyApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi insolvency applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	@Override
	public void removeBygetOsiByS_U(long userId, int status) {
		for (OsiInsolvencyApplication osiInsolvencyApplication :
				findBygetOsiByS_U(
					userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(osiInsolvencyApplication);
		}
	}

	/**
	 * Returns the number of osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching osi insolvency applications
	 */
	@Override
	public int countBygetOsiByS_U(long userId, int status) {
		FinderPath finderPath = _finderPathCountBygetOsiByS_U;

		Object[] finderArgs = new Object[] {userId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETOSIBYS_U_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				queryPos.add(status);

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

	private static final String _FINDER_COLUMN_GETOSIBYS_U_USERID_2 =
		"osiInsolvencyApplication.userId = ? AND ";

	private static final String _FINDER_COLUMN_GETOSIBYS_U_STATUS_2 =
		"osiInsolvencyApplication.status = ?";

	private FinderPath _finderPathFetchBygetOsiByAppNum;
	private FinderPath _finderPathCountBygetOsiByAppNum;

	/**
	 * Returns the osi insolvency application where applicationNumber = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication findBygetOsiByAppNum(
			String applicationNumber)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication =
			fetchBygetOsiByAppNum(applicationNumber);

		if (osiInsolvencyApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiInsolvencyApplicationException(sb.toString());
		}

		return osiInsolvencyApplication;
	}

	/**
	 * Returns the osi insolvency application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication fetchBygetOsiByAppNum(
		String applicationNumber) {

		return fetchBygetOsiByAppNum(applicationNumber, true);
	}

	/**
	 * Returns the osi insolvency application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication fetchBygetOsiByAppNum(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiByAppNum, finderArgs, this);
		}

		if (result instanceof OsiInsolvencyApplication) {
			OsiInsolvencyApplication osiInsolvencyApplication =
				(OsiInsolvencyApplication)result;

			if (!Objects.equals(
					applicationNumber,
					osiInsolvencyApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSIBYAPPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETOSIBYAPPNUM_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
				}

				List<OsiInsolvencyApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiByAppNum, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {applicationNumber};
							}

							_log.warn(
								"OsiInsolvencyApplicationPersistenceImpl.fetchBygetOsiByAppNum(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiInsolvencyApplication osiInsolvencyApplication =
						list.get(0);

					result = osiInsolvencyApplication;

					cacheResult(osiInsolvencyApplication);
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
			return (OsiInsolvencyApplication)result;
		}
	}

	/**
	 * Removes the osi insolvency application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the osi insolvency application that was removed
	 */
	@Override
	public OsiInsolvencyApplication removeBygetOsiByAppNum(
			String applicationNumber)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication =
			findBygetOsiByAppNum(applicationNumber);

		return remove(osiInsolvencyApplication);
	}

	/**
	 * Returns the number of osi insolvency applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching osi insolvency applications
	 */
	@Override
	public int countBygetOsiByAppNum(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetOsiByAppNum;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSIBYAPPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETOSIBYAPPNUM_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
				}

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
		_FINDER_COLUMN_GETOSIBYAPPNUM_APPLICATIONNUMBER_2 =
			"osiInsolvencyApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETOSIBYAPPNUM_APPLICATIONNUMBER_3 =
			"(osiInsolvencyApplication.applicationNumber IS NULL OR osiInsolvencyApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetOsiByCaseId;
	private FinderPath _finderPathCountBygetOsiByCaseId;

	/**
	 * Returns the osi insolvency application where caseId = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication findBygetOsiByCaseId(String caseId)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication =
			fetchBygetOsiByCaseId(caseId);

		if (osiInsolvencyApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiInsolvencyApplicationException(sb.toString());
		}

		return osiInsolvencyApplication;
	}

	/**
	 * Returns the osi insolvency application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication fetchBygetOsiByCaseId(String caseId) {
		return fetchBygetOsiByCaseId(caseId, true);
	}

	/**
	 * Returns the osi insolvency application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication fetchBygetOsiByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiByCaseId, finderArgs, this);
		}

		if (result instanceof OsiInsolvencyApplication) {
			OsiInsolvencyApplication osiInsolvencyApplication =
				(OsiInsolvencyApplication)result;

			if (!Objects.equals(caseId, osiInsolvencyApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSIBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSIBYCASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<OsiInsolvencyApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiByCaseId, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"OsiInsolvencyApplicationPersistenceImpl.fetchBygetOsiByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiInsolvencyApplication osiInsolvencyApplication =
						list.get(0);

					result = osiInsolvencyApplication;

					cacheResult(osiInsolvencyApplication);
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
			return (OsiInsolvencyApplication)result;
		}
	}

	/**
	 * Removes the osi insolvency application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi insolvency application that was removed
	 */
	@Override
	public OsiInsolvencyApplication removeBygetOsiByCaseId(String caseId)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication =
			findBygetOsiByCaseId(caseId);

		return remove(osiInsolvencyApplication);
	}

	/**
	 * Returns the number of osi insolvency applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi insolvency applications
	 */
	@Override
	public int countBygetOsiByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOsiByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSIBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSIBYCASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

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

	private static final String _FINDER_COLUMN_GETOSIBYCASEID_CASEID_2 =
		"osiInsolvencyApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETOSIBYCASEID_CASEID_3 =
		"(osiInsolvencyApplication.caseId IS NULL OR osiInsolvencyApplication.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetOsiInsolvencyByStatus;
	private FinderPath
		_finderPathWithoutPaginationFindBygetOsiInsolvencyByStatus;
	private FinderPath _finderPathCountBygetOsiInsolvencyByStatus;

	/**
	 * Returns all the osi insolvency applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication> findBygetOsiInsolvencyByStatus(
		int status) {

		return findBygetOsiInsolvencyByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi insolvency applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @return the range of matching osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication> findBygetOsiInsolvencyByStatus(
		int status, int start, int end) {

		return findBygetOsiInsolvencyByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication> findBygetOsiInsolvencyByStatus(
		int status, int start, int end,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return findBygetOsiInsolvencyByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication> findBygetOsiInsolvencyByStatus(
		int status, int start, int end,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOsiInsolvencyByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetOsiInsolvencyByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<OsiInsolvencyApplication> list = null;

		if (useFinderCache) {
			list = (List<OsiInsolvencyApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiInsolvencyApplication osiInsolvencyApplication : list) {
					if (status != osiInsolvencyApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIINSOLVENCYBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiInsolvencyApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<OsiInsolvencyApplication>)QueryUtil.list(
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
	 * Returns the first osi insolvency application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication findBygetOsiInsolvencyByStatus_First(
			int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication =
			fetchBygetOsiInsolvencyByStatus_First(status, orderByComparator);

		if (osiInsolvencyApplication != null) {
			return osiInsolvencyApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationException(sb.toString());
	}

	/**
	 * Returns the first osi insolvency application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication fetchBygetOsiInsolvencyByStatus_First(
		int status,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		List<OsiInsolvencyApplication> list = findBygetOsiInsolvencyByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi insolvency application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication findBygetOsiInsolvencyByStatus_Last(
			int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication =
			fetchBygetOsiInsolvencyByStatus_Last(status, orderByComparator);

		if (osiInsolvencyApplication != null) {
			return osiInsolvencyApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationException(sb.toString());
	}

	/**
	 * Returns the last osi insolvency application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication fetchBygetOsiInsolvencyByStatus_Last(
		int status,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		int count = countBygetOsiInsolvencyByStatus(status);

		if (count == 0) {
			return null;
		}

		List<OsiInsolvencyApplication> list = findBygetOsiInsolvencyByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi insolvency applications before and after the current osi insolvency application in the ordered set where status = &#63;.
	 *
	 * @param osiInsolvencyId the primary key of the current osi insolvency application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplication[]
			findBygetOsiInsolvencyByStatus_PrevAndNext(
				long osiInsolvencyId, int status,
				OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication = findByPrimaryKey(
			osiInsolvencyId);

		Session session = null;

		try {
			session = openSession();

			OsiInsolvencyApplication[] array =
				new OsiInsolvencyApplicationImpl[3];

			array[0] = getBygetOsiInsolvencyByStatus_PrevAndNext(
				session, osiInsolvencyApplication, status, orderByComparator,
				true);

			array[1] = osiInsolvencyApplication;

			array[2] = getBygetOsiInsolvencyByStatus_PrevAndNext(
				session, osiInsolvencyApplication, status, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OsiInsolvencyApplication
		getBygetOsiInsolvencyByStatus_PrevAndNext(
			Session session, OsiInsolvencyApplication osiInsolvencyApplication,
			int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIINSOLVENCYBYSTATUS_STATUS_2);

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
			sb.append(OsiInsolvencyApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						osiInsolvencyApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiInsolvencyApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi insolvency applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetOsiInsolvencyByStatus(int status) {
		for (OsiInsolvencyApplication osiInsolvencyApplication :
				findBygetOsiInsolvencyByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiInsolvencyApplication);
		}
	}

	/**
	 * Returns the number of osi insolvency applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching osi insolvency applications
	 */
	@Override
	public int countBygetOsiInsolvencyByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetOsiInsolvencyByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIINSOLVENCYBYSTATUS_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

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
		_FINDER_COLUMN_GETOSIINSOLVENCYBYSTATUS_STATUS_2 =
			"osiInsolvencyApplication.status = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetOsiInsolvencyByStatus_UserId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetOsiInsolvencyByStatus_UserId;
	private FinderPath _finderPathCountBygetOsiInsolvencyByStatus_UserId;

	/**
	 * Returns all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication> findBygetOsiInsolvencyByStatus_UserId(
		long userId, int status) {

		return findBygetOsiInsolvencyByStatus_UserId(
			userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @return the range of matching osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication> findBygetOsiInsolvencyByStatus_UserId(
		long userId, int status, int start, int end) {

		return findBygetOsiInsolvencyByStatus_UserId(
			userId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication> findBygetOsiInsolvencyByStatus_UserId(
		long userId, int status, int start, int end,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return findBygetOsiInsolvencyByStatus_UserId(
			userId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication> findBygetOsiInsolvencyByStatus_UserId(
		long userId, int status, int start, int end,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOsiInsolvencyByStatus_UserId;
				finderArgs = new Object[] {userId, status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetOsiInsolvencyByStatus_UserId;
			finderArgs = new Object[] {
				userId, status, start, end, orderByComparator
			};
		}

		List<OsiInsolvencyApplication> list = null;

		if (useFinderCache) {
			list = (List<OsiInsolvencyApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiInsolvencyApplication osiInsolvencyApplication : list) {
					if ((userId != osiInsolvencyApplication.getUserId()) ||
						(status != osiInsolvencyApplication.getStatus())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIINSOLVENCYBYSTATUS_USERID_USERID_2);

			sb.append(_FINDER_COLUMN_GETOSIINSOLVENCYBYSTATUS_USERID_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiInsolvencyApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				queryPos.add(status);

				list = (List<OsiInsolvencyApplication>)QueryUtil.list(
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
	 * Returns the first osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication findBygetOsiInsolvencyByStatus_UserId_First(
			long userId, int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication =
			fetchBygetOsiInsolvencyByStatus_UserId_First(
				userId, status, orderByComparator);

		if (osiInsolvencyApplication != null) {
			return osiInsolvencyApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationException(sb.toString());
	}

	/**
	 * Returns the first osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication
		fetchBygetOsiInsolvencyByStatus_UserId_First(
			long userId, int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		List<OsiInsolvencyApplication> list =
			findBygetOsiInsolvencyByStatus_UserId(
				userId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication findBygetOsiInsolvencyByStatus_UserId_Last(
			long userId, int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication =
			fetchBygetOsiInsolvencyByStatus_UserId_Last(
				userId, status, orderByComparator);

		if (osiInsolvencyApplication != null) {
			return osiInsolvencyApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationException(sb.toString());
	}

	/**
	 * Returns the last osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication fetchBygetOsiInsolvencyByStatus_UserId_Last(
		long userId, int status,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		int count = countBygetOsiInsolvencyByStatus_UserId(userId, status);

		if (count == 0) {
			return null;
		}

		List<OsiInsolvencyApplication> list =
			findBygetOsiInsolvencyByStatus_UserId(
				userId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi insolvency applications before and after the current osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param osiInsolvencyId the primary key of the current osi insolvency application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplication[]
			findBygetOsiInsolvencyByStatus_UserId_PrevAndNext(
				long osiInsolvencyId, long userId, int status,
				OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication = findByPrimaryKey(
			osiInsolvencyId);

		Session session = null;

		try {
			session = openSession();

			OsiInsolvencyApplication[] array =
				new OsiInsolvencyApplicationImpl[3];

			array[0] = getBygetOsiInsolvencyByStatus_UserId_PrevAndNext(
				session, osiInsolvencyApplication, userId, status,
				orderByComparator, true);

			array[1] = osiInsolvencyApplication;

			array[2] = getBygetOsiInsolvencyByStatus_UserId_PrevAndNext(
				session, osiInsolvencyApplication, userId, status,
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

	protected OsiInsolvencyApplication
		getBygetOsiInsolvencyByStatus_UserId_PrevAndNext(
			Session session, OsiInsolvencyApplication osiInsolvencyApplication,
			long userId, int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIINSOLVENCYBYSTATUS_USERID_USERID_2);

		sb.append(_FINDER_COLUMN_GETOSIINSOLVENCYBYSTATUS_USERID_STATUS_2);

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
			sb.append(OsiInsolvencyApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(userId);

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						osiInsolvencyApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiInsolvencyApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi insolvency applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	@Override
	public void removeBygetOsiInsolvencyByStatus_UserId(
		long userId, int status) {

		for (OsiInsolvencyApplication osiInsolvencyApplication :
				findBygetOsiInsolvencyByStatus_UserId(
					userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(osiInsolvencyApplication);
		}
	}

	/**
	 * Returns the number of osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching osi insolvency applications
	 */
	@Override
	public int countBygetOsiInsolvencyByStatus_UserId(long userId, int status) {
		FinderPath finderPath =
			_finderPathCountBygetOsiInsolvencyByStatus_UserId;

		Object[] finderArgs = new Object[] {userId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIINSOLVENCYBYSTATUS_USERID_USERID_2);

			sb.append(_FINDER_COLUMN_GETOSIINSOLVENCYBYSTATUS_USERID_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				queryPos.add(status);

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
		_FINDER_COLUMN_GETOSIINSOLVENCYBYSTATUS_USERID_USERID_2 =
			"osiInsolvencyApplication.userId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOSIINSOLVENCYBYSTATUS_USERID_STATUS_2 =
			"osiInsolvencyApplication.status = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetOsiInsolvencyByApplicationStatus_Status;
	private FinderPath
		_finderPathWithoutPaginationFindBygetOsiInsolvencyByApplicationStatus_Status;
	private FinderPath
		_finderPathCountBygetOsiInsolvencyByApplicationStatus_Status;

	/**
	 * Returns all the osi insolvency applications where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @return the matching osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByApplicationStatus_Status(
			String applicantStatus, int status) {

		return findBygetOsiInsolvencyByApplicationStatus_Status(
			applicantStatus, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the osi insolvency applications where applicantStatus = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @return the range of matching osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByApplicationStatus_Status(
			String applicantStatus, int status, int start, int end) {

		return findBygetOsiInsolvencyByApplicationStatus_Status(
			applicantStatus, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications where applicantStatus = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByApplicationStatus_Status(
			String applicantStatus, int status, int start, int end,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return findBygetOsiInsolvencyByApplicationStatus_Status(
			applicantStatus, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications where applicantStatus = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByApplicationStatus_Status(
			String applicantStatus, int status, int start, int end,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator,
			boolean useFinderCache) {

		applicantStatus = Objects.toString(applicantStatus, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOsiInsolvencyByApplicationStatus_Status;
				finderArgs = new Object[] {applicantStatus, status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetOsiInsolvencyByApplicationStatus_Status;
			finderArgs = new Object[] {
				applicantStatus, status, start, end, orderByComparator
			};
		}

		List<OsiInsolvencyApplication> list = null;

		if (useFinderCache) {
			list = (List<OsiInsolvencyApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiInsolvencyApplication osiInsolvencyApplication : list) {
					if (!applicantStatus.equals(
							osiInsolvencyApplication.getApplicantStatus()) ||
						(status != osiInsolvencyApplication.getStatus())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATION_WHERE);

			boolean bindApplicantStatus = false;

			if (applicantStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSIINSOLVENCYBYAPPLICATIONSTATUS_STATUS_APPLICANTSTATUS_3);
			}
			else {
				bindApplicantStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOSIINSOLVENCYBYAPPLICATIONSTATUS_STATUS_APPLICANTSTATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETOSIINSOLVENCYBYAPPLICATIONSTATUS_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiInsolvencyApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicantStatus) {
					queryPos.add(applicantStatus);
				}

				queryPos.add(status);

				list = (List<OsiInsolvencyApplication>)QueryUtil.list(
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
	 * Returns the first osi insolvency application in the ordered set where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication
			findBygetOsiInsolvencyByApplicationStatus_Status_First(
				String applicantStatus, int status,
				OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication =
			fetchBygetOsiInsolvencyByApplicationStatus_Status_First(
				applicantStatus, status, orderByComparator);

		if (osiInsolvencyApplication != null) {
			return osiInsolvencyApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("applicantStatus=");
		sb.append(applicantStatus);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationException(sb.toString());
	}

	/**
	 * Returns the first osi insolvency application in the ordered set where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication
		fetchBygetOsiInsolvencyByApplicationStatus_Status_First(
			String applicantStatus, int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		List<OsiInsolvencyApplication> list =
			findBygetOsiInsolvencyByApplicationStatus_Status(
				applicantStatus, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi insolvency application in the ordered set where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication
			findBygetOsiInsolvencyByApplicationStatus_Status_Last(
				String applicantStatus, int status,
				OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication =
			fetchBygetOsiInsolvencyByApplicationStatus_Status_Last(
				applicantStatus, status, orderByComparator);

		if (osiInsolvencyApplication != null) {
			return osiInsolvencyApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("applicantStatus=");
		sb.append(applicantStatus);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationException(sb.toString());
	}

	/**
	 * Returns the last osi insolvency application in the ordered set where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	@Override
	public OsiInsolvencyApplication
		fetchBygetOsiInsolvencyByApplicationStatus_Status_Last(
			String applicantStatus, int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		int count = countBygetOsiInsolvencyByApplicationStatus_Status(
			applicantStatus, status);

		if (count == 0) {
			return null;
		}

		List<OsiInsolvencyApplication> list =
			findBygetOsiInsolvencyByApplicationStatus_Status(
				applicantStatus, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi insolvency applications before and after the current osi insolvency application in the ordered set where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param osiInsolvencyId the primary key of the current osi insolvency application
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplication[]
			findBygetOsiInsolvencyByApplicationStatus_Status_PrevAndNext(
				long osiInsolvencyId, String applicantStatus, int status,
				OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException {

		applicantStatus = Objects.toString(applicantStatus, "");

		OsiInsolvencyApplication osiInsolvencyApplication = findByPrimaryKey(
			osiInsolvencyId);

		Session session = null;

		try {
			session = openSession();

			OsiInsolvencyApplication[] array =
				new OsiInsolvencyApplicationImpl[3];

			array[0] =
				getBygetOsiInsolvencyByApplicationStatus_Status_PrevAndNext(
					session, osiInsolvencyApplication, applicantStatus, status,
					orderByComparator, true);

			array[1] = osiInsolvencyApplication;

			array[2] =
				getBygetOsiInsolvencyByApplicationStatus_Status_PrevAndNext(
					session, osiInsolvencyApplication, applicantStatus, status,
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

	protected OsiInsolvencyApplication
		getBygetOsiInsolvencyByApplicationStatus_Status_PrevAndNext(
			Session session, OsiInsolvencyApplication osiInsolvencyApplication,
			String applicantStatus, int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATION_WHERE);

		boolean bindApplicantStatus = false;

		if (applicantStatus.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETOSIINSOLVENCYBYAPPLICATIONSTATUS_STATUS_APPLICANTSTATUS_3);
		}
		else {
			bindApplicantStatus = true;

			sb.append(
				_FINDER_COLUMN_GETOSIINSOLVENCYBYAPPLICATIONSTATUS_STATUS_APPLICANTSTATUS_2);
		}

		sb.append(
			_FINDER_COLUMN_GETOSIINSOLVENCYBYAPPLICATIONSTATUS_STATUS_STATUS_2);

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
			sb.append(OsiInsolvencyApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindApplicantStatus) {
			queryPos.add(applicantStatus);
		}

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						osiInsolvencyApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiInsolvencyApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi insolvency applications where applicantStatus = &#63; and status = &#63; from the database.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 */
	@Override
	public void removeBygetOsiInsolvencyByApplicationStatus_Status(
		String applicantStatus, int status) {

		for (OsiInsolvencyApplication osiInsolvencyApplication :
				findBygetOsiInsolvencyByApplicationStatus_Status(
					applicantStatus, status, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(osiInsolvencyApplication);
		}
	}

	/**
	 * Returns the number of osi insolvency applications where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @return the number of matching osi insolvency applications
	 */
	@Override
	public int countBygetOsiInsolvencyByApplicationStatus_Status(
		String applicantStatus, int status) {

		applicantStatus = Objects.toString(applicantStatus, "");

		FinderPath finderPath =
			_finderPathCountBygetOsiInsolvencyByApplicationStatus_Status;

		Object[] finderArgs = new Object[] {applicantStatus, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATION_WHERE);

			boolean bindApplicantStatus = false;

			if (applicantStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSIINSOLVENCYBYAPPLICATIONSTATUS_STATUS_APPLICANTSTATUS_3);
			}
			else {
				bindApplicantStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOSIINSOLVENCYBYAPPLICATIONSTATUS_STATUS_APPLICANTSTATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETOSIINSOLVENCYBYAPPLICATIONSTATUS_STATUS_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicantStatus) {
					queryPos.add(applicantStatus);
				}

				queryPos.add(status);

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
		_FINDER_COLUMN_GETOSIINSOLVENCYBYAPPLICATIONSTATUS_STATUS_APPLICANTSTATUS_2 =
			"osiInsolvencyApplication.applicantStatus = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOSIINSOLVENCYBYAPPLICATIONSTATUS_STATUS_APPLICANTSTATUS_3 =
			"(osiInsolvencyApplication.applicantStatus IS NULL OR osiInsolvencyApplication.applicantStatus = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOSIINSOLVENCYBYAPPLICATIONSTATUS_STATUS_STATUS_2 =
			"osiInsolvencyApplication.status = ?";

	public OsiInsolvencyApplicationPersistenceImpl() {
		setModelClass(OsiInsolvencyApplication.class);

		setModelImplClass(OsiInsolvencyApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(OsiInsolvencyApplicationTable.INSTANCE);
	}

	/**
	 * Caches the osi insolvency application in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyApplication the osi insolvency application
	 */
	@Override
	public void cacheResult(OsiInsolvencyApplication osiInsolvencyApplication) {
		entityCache.putResult(
			OsiInsolvencyApplicationImpl.class,
			osiInsolvencyApplication.getPrimaryKey(), osiInsolvencyApplication);

		finderCache.putResult(
			_finderPathFetchBygetOsiInsolvencyById,
			new Object[] {osiInsolvencyApplication.getOsiInsolvencyId()},
			osiInsolvencyApplication);

		finderCache.putResult(
			_finderPathFetchBygetOsiByAppNum,
			new Object[] {osiInsolvencyApplication.getApplicationNumber()},
			osiInsolvencyApplication);

		finderCache.putResult(
			_finderPathFetchBygetOsiByCaseId,
			new Object[] {osiInsolvencyApplication.getCaseId()},
			osiInsolvencyApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi insolvency applications in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyApplications the osi insolvency applications
	 */
	@Override
	public void cacheResult(
		List<OsiInsolvencyApplication> osiInsolvencyApplications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiInsolvencyApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiInsolvencyApplication osiInsolvencyApplication :
				osiInsolvencyApplications) {

			if (entityCache.getResult(
					OsiInsolvencyApplicationImpl.class,
					osiInsolvencyApplication.getPrimaryKey()) == null) {

				cacheResult(osiInsolvencyApplication);
			}
		}
	}

	/**
	 * Clears the cache for all osi insolvency applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiInsolvencyApplicationImpl.class);

		finderCache.clearCache(OsiInsolvencyApplicationImpl.class);
	}

	/**
	 * Clears the cache for the osi insolvency application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OsiInsolvencyApplication osiInsolvencyApplication) {
		entityCache.removeResult(
			OsiInsolvencyApplicationImpl.class, osiInsolvencyApplication);
	}

	@Override
	public void clearCache(
		List<OsiInsolvencyApplication> osiInsolvencyApplications) {

		for (OsiInsolvencyApplication osiInsolvencyApplication :
				osiInsolvencyApplications) {

			entityCache.removeResult(
				OsiInsolvencyApplicationImpl.class, osiInsolvencyApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiInsolvencyApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiInsolvencyApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiInsolvencyApplicationModelImpl osiInsolvencyApplicationModelImpl) {

		Object[] args = new Object[] {
			osiInsolvencyApplicationModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiInsolvencyById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiInsolvencyById, args,
			osiInsolvencyApplicationModelImpl);

		args = new Object[] {
			osiInsolvencyApplicationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiByAppNum, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiByAppNum, args,
			osiInsolvencyApplicationModelImpl);

		args = new Object[] {osiInsolvencyApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetOsiByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiByCaseId, args,
			osiInsolvencyApplicationModelImpl);
	}

	/**
	 * Creates a new osi insolvency application with the primary key. Does not add the osi insolvency application to the database.
	 *
	 * @param osiInsolvencyId the primary key for the new osi insolvency application
	 * @return the new osi insolvency application
	 */
	@Override
	public OsiInsolvencyApplication create(long osiInsolvencyId) {
		OsiInsolvencyApplication osiInsolvencyApplication =
			new OsiInsolvencyApplicationImpl();

		osiInsolvencyApplication.setNew(true);
		osiInsolvencyApplication.setPrimaryKey(osiInsolvencyId);

		osiInsolvencyApplication.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return osiInsolvencyApplication;
	}

	/**
	 * Removes the osi insolvency application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsolvencyId the primary key of the osi insolvency application
	 * @return the osi insolvency application that was removed
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplication remove(long osiInsolvencyId)
		throws NoSuchOsiInsolvencyApplicationException {

		return remove((Serializable)osiInsolvencyId);
	}

	/**
	 * Removes the osi insolvency application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi insolvency application
	 * @return the osi insolvency application that was removed
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplication remove(Serializable primaryKey)
		throws NoSuchOsiInsolvencyApplicationException {

		Session session = null;

		try {
			session = openSession();

			OsiInsolvencyApplication osiInsolvencyApplication =
				(OsiInsolvencyApplication)session.get(
					OsiInsolvencyApplicationImpl.class, primaryKey);

			if (osiInsolvencyApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiInsolvencyApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiInsolvencyApplication);
		}
		catch (NoSuchOsiInsolvencyApplicationException noSuchEntityException) {
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
	protected OsiInsolvencyApplication removeImpl(
		OsiInsolvencyApplication osiInsolvencyApplication) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiInsolvencyApplication)) {
				osiInsolvencyApplication =
					(OsiInsolvencyApplication)session.get(
						OsiInsolvencyApplicationImpl.class,
						osiInsolvencyApplication.getPrimaryKeyObj());
			}

			if (osiInsolvencyApplication != null) {
				session.delete(osiInsolvencyApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiInsolvencyApplication != null) {
			clearCache(osiInsolvencyApplication);
		}

		return osiInsolvencyApplication;
	}

	@Override
	public OsiInsolvencyApplication updateImpl(
		OsiInsolvencyApplication osiInsolvencyApplication) {

		boolean isNew = osiInsolvencyApplication.isNew();

		if (!(osiInsolvencyApplication instanceof
				OsiInsolvencyApplicationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiInsolvencyApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiInsolvencyApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiInsolvencyApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiInsolvencyApplication implementation " +
					osiInsolvencyApplication.getClass());
		}

		OsiInsolvencyApplicationModelImpl osiInsolvencyApplicationModelImpl =
			(OsiInsolvencyApplicationModelImpl)osiInsolvencyApplication;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiInsolvencyApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiInsolvencyApplication.setCreateDate(date);
			}
			else {
				osiInsolvencyApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiInsolvencyApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiInsolvencyApplication.setModifiedDate(date);
			}
			else {
				osiInsolvencyApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiInsolvencyApplication);
			}
			else {
				osiInsolvencyApplication =
					(OsiInsolvencyApplication)session.merge(
						osiInsolvencyApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiInsolvencyApplicationImpl.class,
			osiInsolvencyApplicationModelImpl, false, true);

		cacheUniqueFindersCache(osiInsolvencyApplicationModelImpl);

		if (isNew) {
			osiInsolvencyApplication.setNew(false);
		}

		osiInsolvencyApplication.resetOriginalValues();

		return osiInsolvencyApplication;
	}

	/**
	 * Returns the osi insolvency application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi insolvency application
	 * @return the osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiInsolvencyApplicationException {

		OsiInsolvencyApplication osiInsolvencyApplication = fetchByPrimaryKey(
			primaryKey);

		if (osiInsolvencyApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiInsolvencyApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiInsolvencyApplication;
	}

	/**
	 * Returns the osi insolvency application with the primary key or throws a <code>NoSuchOsiInsolvencyApplicationException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the primary key of the osi insolvency application
	 * @return the osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplication findByPrimaryKey(long osiInsolvencyId)
		throws NoSuchOsiInsolvencyApplicationException {

		return findByPrimaryKey((Serializable)osiInsolvencyId);
	}

	/**
	 * Returns the osi insolvency application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the primary key of the osi insolvency application
	 * @return the osi insolvency application, or <code>null</code> if a osi insolvency application with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplication fetchByPrimaryKey(long osiInsolvencyId) {
		return fetchByPrimaryKey((Serializable)osiInsolvencyId);
	}

	/**
	 * Returns all the osi insolvency applications.
	 *
	 * @return the osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi insolvency applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @return the range of osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolvency applications
	 */
	@Override
	public List<OsiInsolvencyApplication> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator,
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

		List<OsiInsolvencyApplication> list = null;

		if (useFinderCache) {
			list = (List<OsiInsolvencyApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSIINSOLVENCYAPPLICATION;

				sql = sql.concat(
					OsiInsolvencyApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiInsolvencyApplication>)QueryUtil.list(
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
	 * Removes all the osi insolvency applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiInsolvencyApplication osiInsolvencyApplication : findAll()) {
			remove(osiInsolvencyApplication);
		}
	}

	/**
	 * Returns the number of osi insolvency applications.
	 *
	 * @return the number of osi insolvency applications
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
					_SQL_COUNT_OSIINSOLVENCYAPPLICATION);

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
		return "osiInsolvencyId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSIINSOLVENCYAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiInsolvencyApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi insolvency application persistence.
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

		_finderPathFetchBygetOsiInsolvencyById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiInsolvencyById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiInsolvencyById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOsiInsolvencyById", new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		_finderPathWithPaginationFindBygetOsiByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOsiByS_U",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"userId", "status"}, true);

		_finderPathWithoutPaginationFindBygetOsiByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOsiByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, true);

		_finderPathCountBygetOsiByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, false);

		_finderPathFetchBygetOsiByAppNum = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiByAppNum",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetOsiByAppNum = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiByAppNum",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetOsiByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetOsiByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetOsiInsolvencyByStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetOsiInsolvencyByStatus",
				new String[] {
					Integer.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetOsiInsolvencyByStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetOsiInsolvencyByStatus",
				new String[] {Integer.class.getName()}, new String[] {"status"},
				true);

		_finderPathCountBygetOsiInsolvencyByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOsiInsolvencyByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetOsiInsolvencyByStatus_UserId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetOsiInsolvencyByStatus_UserId",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"userId", "status"}, true);

		_finderPathWithoutPaginationFindBygetOsiInsolvencyByStatus_UserId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetOsiInsolvencyByStatus_UserId",
				new String[] {Long.class.getName(), Integer.class.getName()},
				new String[] {"userId", "status"}, true);

		_finderPathCountBygetOsiInsolvencyByStatus_UserId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOsiInsolvencyByStatus_UserId",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, false);

		_finderPathWithPaginationFindBygetOsiInsolvencyByApplicationStatus_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetOsiInsolvencyByApplicationStatus_Status",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"applicantStatus", "status"}, true);

		_finderPathWithoutPaginationFindBygetOsiInsolvencyByApplicationStatus_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetOsiInsolvencyByApplicationStatus_Status",
				new String[] {String.class.getName(), Integer.class.getName()},
				new String[] {"applicantStatus", "status"}, true);

		_finderPathCountBygetOsiInsolvencyByApplicationStatus_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetOsiInsolvencyByApplicationStatus_Status",
				new String[] {String.class.getName(), Integer.class.getName()},
				new String[] {"applicantStatus", "status"}, false);

		OsiInsolvencyApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiInsolvencyApplicationUtil.setPersistence(null);

		entityCache.removeCache(OsiInsolvencyApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSIINSOLVENCYAPPLICATION =
		"SELECT osiInsolvencyApplication FROM OsiInsolvencyApplication osiInsolvencyApplication";

	private static final String _SQL_SELECT_OSIINSOLVENCYAPPLICATION_WHERE =
		"SELECT osiInsolvencyApplication FROM OsiInsolvencyApplication osiInsolvencyApplication WHERE ";

	private static final String _SQL_COUNT_OSIINSOLVENCYAPPLICATION =
		"SELECT COUNT(osiInsolvencyApplication) FROM OsiInsolvencyApplication osiInsolvencyApplication";

	private static final String _SQL_COUNT_OSIINSOLVENCYAPPLICATION_WHERE =
		"SELECT COUNT(osiInsolvencyApplication) FROM OsiInsolvencyApplication osiInsolvencyApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiInsolvencyApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiInsolvencyApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiInsolvencyApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiInsolvencyApplicationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}