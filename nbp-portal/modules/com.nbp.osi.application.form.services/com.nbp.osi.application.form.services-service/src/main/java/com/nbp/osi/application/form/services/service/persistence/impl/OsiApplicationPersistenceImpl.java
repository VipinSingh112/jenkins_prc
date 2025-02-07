/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence.impl;

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

import com.nbp.osi.application.form.services.exception.NoSuchOsiApplicationException;
import com.nbp.osi.application.form.services.model.OsiApplication;
import com.nbp.osi.application.form.services.model.OsiApplicationTable;
import com.nbp.osi.application.form.services.model.impl.OsiApplicationImpl;
import com.nbp.osi.application.form.services.model.impl.OsiApplicationModelImpl;
import com.nbp.osi.application.form.services.service.persistence.OsiApplicationPersistence;
import com.nbp.osi.application.form.services.service.persistence.OsiApplicationUtil;
import com.nbp.osi.application.form.services.service.persistence.impl.constants.OSIPersistenceConstants;

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
 * The persistence implementation for the osi application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiApplicationPersistence.class)
public class OsiApplicationPersistenceImpl
	extends BasePersistenceImpl<OsiApplication>
	implements OsiApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiApplicationUtil</code> to access the osi application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiApplicationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetOsiByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetOsiByS_U;
	private FinderPath _finderPathCountBygetOsiByS_U;

	/**
	 * Returns all the osi applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching osi applications
	 */
	@Override
	public List<OsiApplication> findBygetOsiByS_U(long userId, int status) {
		return findBygetOsiByS_U(
			userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @return the range of matching osi applications
	 */
	@Override
	public List<OsiApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end) {

		return findBygetOsiByS_U(userId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi applications
	 */
	@Override
	public List<OsiApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<OsiApplication> orderByComparator) {

		return findBygetOsiByS_U(
			userId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi applications
	 */
	@Override
	public List<OsiApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<OsiApplication> orderByComparator,
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

		List<OsiApplication> list = null;

		if (useFinderCache) {
			list = (List<OsiApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiApplication osiApplication : list) {
					if ((userId != osiApplication.getUserId()) ||
						(status != osiApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_OSIAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETOSIBYS_U_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				queryPos.add(status);

				list = (List<OsiApplication>)QueryUtil.list(
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
	 * Returns the first osi application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	@Override
	public OsiApplication findBygetOsiByS_U_First(
			long userId, int status,
			OrderByComparator<OsiApplication> orderByComparator)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = fetchBygetOsiByS_U_First(
			userId, status, orderByComparator);

		if (osiApplication != null) {
			return osiApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiApplicationException(sb.toString());
	}

	/**
	 * Returns the first osi application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	@Override
	public OsiApplication fetchBygetOsiByS_U_First(
		long userId, int status,
		OrderByComparator<OsiApplication> orderByComparator) {

		List<OsiApplication> list = findBygetOsiByS_U(
			userId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	@Override
	public OsiApplication findBygetOsiByS_U_Last(
			long userId, int status,
			OrderByComparator<OsiApplication> orderByComparator)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = fetchBygetOsiByS_U_Last(
			userId, status, orderByComparator);

		if (osiApplication != null) {
			return osiApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiApplicationException(sb.toString());
	}

	/**
	 * Returns the last osi application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	@Override
	public OsiApplication fetchBygetOsiByS_U_Last(
		long userId, int status,
		OrderByComparator<OsiApplication> orderByComparator) {

		int count = countBygetOsiByS_U(userId, status);

		if (count == 0) {
			return null;
		}

		List<OsiApplication> list = findBygetOsiByS_U(
			userId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi applications before and after the current osi application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param osiApplicationId the primary key of the current osi application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	@Override
	public OsiApplication[] findBygetOsiByS_U_PrevAndNext(
			long osiApplicationId, long userId, int status,
			OrderByComparator<OsiApplication> orderByComparator)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = findByPrimaryKey(osiApplicationId);

		Session session = null;

		try {
			session = openSession();

			OsiApplication[] array = new OsiApplicationImpl[3];

			array[0] = getBygetOsiByS_U_PrevAndNext(
				session, osiApplication, userId, status, orderByComparator,
				true);

			array[1] = osiApplication;

			array[2] = getBygetOsiByS_U_PrevAndNext(
				session, osiApplication, userId, status, orderByComparator,
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

	protected OsiApplication getBygetOsiByS_U_PrevAndNext(
		Session session, OsiApplication osiApplication, long userId, int status,
		OrderByComparator<OsiApplication> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_OSIAPPLICATION_WHERE);

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
			sb.append(OsiApplicationModelImpl.ORDER_BY_JPQL);
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
						osiApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	@Override
	public void removeBygetOsiByS_U(long userId, int status) {
		for (OsiApplication osiApplication :
				findBygetOsiByS_U(
					userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(osiApplication);
		}
	}

	/**
	 * Returns the number of osi applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching osi applications
	 */
	@Override
	public int countBygetOsiByS_U(long userId, int status) {
		FinderPath finderPath = _finderPathCountBygetOsiByS_U;

		Object[] finderArgs = new Object[] {userId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSIAPPLICATION_WHERE);

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
		"osiApplication.userId = ? AND ";

	private static final String _FINDER_COLUMN_GETOSIBYS_U_STATUS_2 =
		"osiApplication.status = ?";

	private FinderPath _finderPathWithPaginationFindBygetOsiByStatus_UserId;
	private FinderPath _finderPathWithoutPaginationFindBygetOsiByStatus_UserId;
	private FinderPath _finderPathCountBygetOsiByStatus_UserId;

	/**
	 * Returns all the osi applications where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @return the matching osi applications
	 */
	@Override
	public List<OsiApplication> findBygetOsiByStatus_UserId(
		long userId, int applicationStatus) {

		return findBygetOsiByStatus_UserId(
			userId, applicationStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the osi applications where userId = &#63; and applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @return the range of matching osi applications
	 */
	@Override
	public List<OsiApplication> findBygetOsiByStatus_UserId(
		long userId, int applicationStatus, int start, int end) {

		return findBygetOsiByStatus_UserId(
			userId, applicationStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi applications where userId = &#63; and applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi applications
	 */
	@Override
	public List<OsiApplication> findBygetOsiByStatus_UserId(
		long userId, int applicationStatus, int start, int end,
		OrderByComparator<OsiApplication> orderByComparator) {

		return findBygetOsiByStatus_UserId(
			userId, applicationStatus, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi applications where userId = &#63; and applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi applications
	 */
	@Override
	public List<OsiApplication> findBygetOsiByStatus_UserId(
		long userId, int applicationStatus, int start, int end,
		OrderByComparator<OsiApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOsiByStatus_UserId;
				finderArgs = new Object[] {userId, applicationStatus};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOsiByStatus_UserId;
			finderArgs = new Object[] {
				userId, applicationStatus, start, end, orderByComparator
			};
		}

		List<OsiApplication> list = null;

		if (useFinderCache) {
			list = (List<OsiApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiApplication osiApplication : list) {
					if ((userId != osiApplication.getUserId()) ||
						(applicationStatus !=
							osiApplication.getApplicationStatus())) {

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

			sb.append(_SQL_SELECT_OSIAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYSTATUS_USERID_USERID_2);

			sb.append(_FINDER_COLUMN_GETOSIBYSTATUS_USERID_APPLICATIONSTATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				queryPos.add(applicationStatus);

				list = (List<OsiApplication>)QueryUtil.list(
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
	 * Returns the first osi application in the ordered set where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	@Override
	public OsiApplication findBygetOsiByStatus_UserId_First(
			long userId, int applicationStatus,
			OrderByComparator<OsiApplication> orderByComparator)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = fetchBygetOsiByStatus_UserId_First(
			userId, applicationStatus, orderByComparator);

		if (osiApplication != null) {
			return osiApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", applicationStatus=");
		sb.append(applicationStatus);

		sb.append("}");

		throw new NoSuchOsiApplicationException(sb.toString());
	}

	/**
	 * Returns the first osi application in the ordered set where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	@Override
	public OsiApplication fetchBygetOsiByStatus_UserId_First(
		long userId, int applicationStatus,
		OrderByComparator<OsiApplication> orderByComparator) {

		List<OsiApplication> list = findBygetOsiByStatus_UserId(
			userId, applicationStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi application in the ordered set where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	@Override
	public OsiApplication findBygetOsiByStatus_UserId_Last(
			long userId, int applicationStatus,
			OrderByComparator<OsiApplication> orderByComparator)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = fetchBygetOsiByStatus_UserId_Last(
			userId, applicationStatus, orderByComparator);

		if (osiApplication != null) {
			return osiApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", applicationStatus=");
		sb.append(applicationStatus);

		sb.append("}");

		throw new NoSuchOsiApplicationException(sb.toString());
	}

	/**
	 * Returns the last osi application in the ordered set where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	@Override
	public OsiApplication fetchBygetOsiByStatus_UserId_Last(
		long userId, int applicationStatus,
		OrderByComparator<OsiApplication> orderByComparator) {

		int count = countBygetOsiByStatus_UserId(userId, applicationStatus);

		if (count == 0) {
			return null;
		}

		List<OsiApplication> list = findBygetOsiByStatus_UserId(
			userId, applicationStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi applications before and after the current osi application in the ordered set where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param osiApplicationId the primary key of the current osi application
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	@Override
	public OsiApplication[] findBygetOsiByStatus_UserId_PrevAndNext(
			long osiApplicationId, long userId, int applicationStatus,
			OrderByComparator<OsiApplication> orderByComparator)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = findByPrimaryKey(osiApplicationId);

		Session session = null;

		try {
			session = openSession();

			OsiApplication[] array = new OsiApplicationImpl[3];

			array[0] = getBygetOsiByStatus_UserId_PrevAndNext(
				session, osiApplication, userId, applicationStatus,
				orderByComparator, true);

			array[1] = osiApplication;

			array[2] = getBygetOsiByStatus_UserId_PrevAndNext(
				session, osiApplication, userId, applicationStatus,
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

	protected OsiApplication getBygetOsiByStatus_UserId_PrevAndNext(
		Session session, OsiApplication osiApplication, long userId,
		int applicationStatus,
		OrderByComparator<OsiApplication> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_OSIAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIBYSTATUS_USERID_USERID_2);

		sb.append(_FINDER_COLUMN_GETOSIBYSTATUS_USERID_APPLICATIONSTATUS_2);

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
			sb.append(OsiApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(userId);

		queryPos.add(applicationStatus);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						osiApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi applications where userId = &#63; and applicationStatus = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 */
	@Override
	public void removeBygetOsiByStatus_UserId(
		long userId, int applicationStatus) {

		for (OsiApplication osiApplication :
				findBygetOsiByStatus_UserId(
					userId, applicationStatus, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(osiApplication);
		}
	}

	/**
	 * Returns the number of osi applications where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @return the number of matching osi applications
	 */
	@Override
	public int countBygetOsiByStatus_UserId(
		long userId, int applicationStatus) {

		FinderPath finderPath = _finderPathCountBygetOsiByStatus_UserId;

		Object[] finderArgs = new Object[] {userId, applicationStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSIAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYSTATUS_USERID_USERID_2);

			sb.append(_FINDER_COLUMN_GETOSIBYSTATUS_USERID_APPLICATIONSTATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				queryPos.add(applicationStatus);

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

	private static final String _FINDER_COLUMN_GETOSIBYSTATUS_USERID_USERID_2 =
		"osiApplication.userId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOSIBYSTATUS_USERID_APPLICATIONSTATUS_2 =
			"osiApplication.applicationStatus = ?";

	private FinderPath _finderPathWithPaginationFindBygetOsiByAppStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetOsiByAppStatus;
	private FinderPath _finderPathCountBygetOsiByAppStatus;

	/**
	 * Returns all the osi applications where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @return the matching osi applications
	 */
	@Override
	public List<OsiApplication> findBygetOsiByAppStatus(int applicationStatus) {
		return findBygetOsiByAppStatus(
			applicationStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi applications where applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @return the range of matching osi applications
	 */
	@Override
	public List<OsiApplication> findBygetOsiByAppStatus(
		int applicationStatus, int start, int end) {

		return findBygetOsiByAppStatus(applicationStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi applications where applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi applications
	 */
	@Override
	public List<OsiApplication> findBygetOsiByAppStatus(
		int applicationStatus, int start, int end,
		OrderByComparator<OsiApplication> orderByComparator) {

		return findBygetOsiByAppStatus(
			applicationStatus, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi applications where applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi applications
	 */
	@Override
	public List<OsiApplication> findBygetOsiByAppStatus(
		int applicationStatus, int start, int end,
		OrderByComparator<OsiApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOsiByAppStatus;
				finderArgs = new Object[] {applicationStatus};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOsiByAppStatus;
			finderArgs = new Object[] {
				applicationStatus, start, end, orderByComparator
			};
		}

		List<OsiApplication> list = null;

		if (useFinderCache) {
			list = (List<OsiApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiApplication osiApplication : list) {
					if (applicationStatus !=
							osiApplication.getApplicationStatus()) {

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

			sb.append(_SQL_SELECT_OSIAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYAPPSTATUS_APPLICATIONSTATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(applicationStatus);

				list = (List<OsiApplication>)QueryUtil.list(
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
	 * Returns the first osi application in the ordered set where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	@Override
	public OsiApplication findBygetOsiByAppStatus_First(
			int applicationStatus,
			OrderByComparator<OsiApplication> orderByComparator)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = fetchBygetOsiByAppStatus_First(
			applicationStatus, orderByComparator);

		if (osiApplication != null) {
			return osiApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("applicationStatus=");
		sb.append(applicationStatus);

		sb.append("}");

		throw new NoSuchOsiApplicationException(sb.toString());
	}

	/**
	 * Returns the first osi application in the ordered set where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	@Override
	public OsiApplication fetchBygetOsiByAppStatus_First(
		int applicationStatus,
		OrderByComparator<OsiApplication> orderByComparator) {

		List<OsiApplication> list = findBygetOsiByAppStatus(
			applicationStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi application in the ordered set where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	@Override
	public OsiApplication findBygetOsiByAppStatus_Last(
			int applicationStatus,
			OrderByComparator<OsiApplication> orderByComparator)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = fetchBygetOsiByAppStatus_Last(
			applicationStatus, orderByComparator);

		if (osiApplication != null) {
			return osiApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("applicationStatus=");
		sb.append(applicationStatus);

		sb.append("}");

		throw new NoSuchOsiApplicationException(sb.toString());
	}

	/**
	 * Returns the last osi application in the ordered set where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	@Override
	public OsiApplication fetchBygetOsiByAppStatus_Last(
		int applicationStatus,
		OrderByComparator<OsiApplication> orderByComparator) {

		int count = countBygetOsiByAppStatus(applicationStatus);

		if (count == 0) {
			return null;
		}

		List<OsiApplication> list = findBygetOsiByAppStatus(
			applicationStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi applications before and after the current osi application in the ordered set where applicationStatus = &#63;.
	 *
	 * @param osiApplicationId the primary key of the current osi application
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	@Override
	public OsiApplication[] findBygetOsiByAppStatus_PrevAndNext(
			long osiApplicationId, int applicationStatus,
			OrderByComparator<OsiApplication> orderByComparator)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = findByPrimaryKey(osiApplicationId);

		Session session = null;

		try {
			session = openSession();

			OsiApplication[] array = new OsiApplicationImpl[3];

			array[0] = getBygetOsiByAppStatus_PrevAndNext(
				session, osiApplication, applicationStatus, orderByComparator,
				true);

			array[1] = osiApplication;

			array[2] = getBygetOsiByAppStatus_PrevAndNext(
				session, osiApplication, applicationStatus, orderByComparator,
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

	protected OsiApplication getBygetOsiByAppStatus_PrevAndNext(
		Session session, OsiApplication osiApplication, int applicationStatus,
		OrderByComparator<OsiApplication> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_OSIAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIBYAPPSTATUS_APPLICATIONSTATUS_2);

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
			sb.append(OsiApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(applicationStatus);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						osiApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi applications where applicationStatus = &#63; from the database.
	 *
	 * @param applicationStatus the application status
	 */
	@Override
	public void removeBygetOsiByAppStatus(int applicationStatus) {
		for (OsiApplication osiApplication :
				findBygetOsiByAppStatus(
					applicationStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(osiApplication);
		}
	}

	/**
	 * Returns the number of osi applications where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @return the number of matching osi applications
	 */
	@Override
	public int countBygetOsiByAppStatus(int applicationStatus) {
		FinderPath finderPath = _finderPathCountBygetOsiByAppStatus;

		Object[] finderArgs = new Object[] {applicationStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYAPPSTATUS_APPLICATIONSTATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(applicationStatus);

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
		_FINDER_COLUMN_GETOSIBYAPPSTATUS_APPLICATIONSTATUS_2 =
			"osiApplication.applicationStatus = ?";

	private FinderPath _finderPathWithPaginationFindBygetOsiByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetOsiByStatus;
	private FinderPath _finderPathCountBygetOsiByStatus;

	/**
	 * Returns all the osi applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching osi applications
	 */
	@Override
	public List<OsiApplication> findBygetOsiByStatus(int status) {
		return findBygetOsiByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @return the range of matching osi applications
	 */
	@Override
	public List<OsiApplication> findBygetOsiByStatus(
		int status, int start, int end) {

		return findBygetOsiByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi applications
	 */
	@Override
	public List<OsiApplication> findBygetOsiByStatus(
		int status, int start, int end,
		OrderByComparator<OsiApplication> orderByComparator) {

		return findBygetOsiByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi applications
	 */
	@Override
	public List<OsiApplication> findBygetOsiByStatus(
		int status, int start, int end,
		OrderByComparator<OsiApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOsiByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOsiByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<OsiApplication> list = null;

		if (useFinderCache) {
			list = (List<OsiApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiApplication osiApplication : list) {
					if (status != osiApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_OSIAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<OsiApplication>)QueryUtil.list(
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
	 * Returns the first osi application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	@Override
	public OsiApplication findBygetOsiByStatus_First(
			int status, OrderByComparator<OsiApplication> orderByComparator)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = fetchBygetOsiByStatus_First(
			status, orderByComparator);

		if (osiApplication != null) {
			return osiApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiApplicationException(sb.toString());
	}

	/**
	 * Returns the first osi application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	@Override
	public OsiApplication fetchBygetOsiByStatus_First(
		int status, OrderByComparator<OsiApplication> orderByComparator) {

		List<OsiApplication> list = findBygetOsiByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	@Override
	public OsiApplication findBygetOsiByStatus_Last(
			int status, OrderByComparator<OsiApplication> orderByComparator)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = fetchBygetOsiByStatus_Last(
			status, orderByComparator);

		if (osiApplication != null) {
			return osiApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiApplicationException(sb.toString());
	}

	/**
	 * Returns the last osi application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	@Override
	public OsiApplication fetchBygetOsiByStatus_Last(
		int status, OrderByComparator<OsiApplication> orderByComparator) {

		int count = countBygetOsiByStatus(status);

		if (count == 0) {
			return null;
		}

		List<OsiApplication> list = findBygetOsiByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi applications before and after the current osi application in the ordered set where status = &#63;.
	 *
	 * @param osiApplicationId the primary key of the current osi application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	@Override
	public OsiApplication[] findBygetOsiByStatus_PrevAndNext(
			long osiApplicationId, int status,
			OrderByComparator<OsiApplication> orderByComparator)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = findByPrimaryKey(osiApplicationId);

		Session session = null;

		try {
			session = openSession();

			OsiApplication[] array = new OsiApplicationImpl[3];

			array[0] = getBygetOsiByStatus_PrevAndNext(
				session, osiApplication, status, orderByComparator, true);

			array[1] = osiApplication;

			array[2] = getBygetOsiByStatus_PrevAndNext(
				session, osiApplication, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OsiApplication getBygetOsiByStatus_PrevAndNext(
		Session session, OsiApplication osiApplication, int status,
		OrderByComparator<OsiApplication> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_OSIAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIBYSTATUS_STATUS_2);

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
			sb.append(OsiApplicationModelImpl.ORDER_BY_JPQL);
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
						osiApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetOsiByStatus(int status) {
		for (OsiApplication osiApplication :
				findBygetOsiByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiApplication);
		}
	}

	/**
	 * Returns the number of osi applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching osi applications
	 */
	@Override
	public int countBygetOsiByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetOsiByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYSTATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETOSIBYSTATUS_STATUS_2 =
		"osiApplication.status = ?";

	private FinderPath _finderPathFetchBygetOsiByAppNum;
	private FinderPath _finderPathCountBygetOsiByAppNum;

	/**
	 * Returns the osi application where applicationNumber = &#63; or throws a <code>NoSuchOsiApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	@Override
	public OsiApplication findBygetOsiByAppNum(String applicationNumber)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = fetchBygetOsiByAppNum(
			applicationNumber);

		if (osiApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiApplicationException(sb.toString());
		}

		return osiApplication;
	}

	/**
	 * Returns the osi application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	@Override
	public OsiApplication fetchBygetOsiByAppNum(String applicationNumber) {
		return fetchBygetOsiByAppNum(applicationNumber, true);
	}

	/**
	 * Returns the osi application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	@Override
	public OsiApplication fetchBygetOsiByAppNum(
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

		if (result instanceof OsiApplication) {
			OsiApplication osiApplication = (OsiApplication)result;

			if (!Objects.equals(
					applicationNumber, osiApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIAPPLICATION_WHERE);

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

				List<OsiApplication> list = query.list();

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
								"OsiApplicationPersistenceImpl.fetchBygetOsiByAppNum(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiApplication osiApplication = list.get(0);

					result = osiApplication;

					cacheResult(osiApplication);
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
			return (OsiApplication)result;
		}
	}

	/**
	 * Removes the osi application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the osi application that was removed
	 */
	@Override
	public OsiApplication removeBygetOsiByAppNum(String applicationNumber)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = findBygetOsiByAppNum(applicationNumber);

		return remove(osiApplication);
	}

	/**
	 * Returns the number of osi applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching osi applications
	 */
	@Override
	public int countBygetOsiByAppNum(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetOsiByAppNum;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIAPPLICATION_WHERE);

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
			"osiApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETOSIBYAPPNUM_APPLICATIONNUMBER_3 =
			"(osiApplication.applicationNumber IS NULL OR osiApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetOsiByCaseId;
	private FinderPath _finderPathCountBygetOsiByCaseId;

	/**
	 * Returns the osi application where caseId = &#63; or throws a <code>NoSuchOsiApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	@Override
	public OsiApplication findBygetOsiByCaseId(String caseId)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = fetchBygetOsiByCaseId(caseId);

		if (osiApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiApplicationException(sb.toString());
		}

		return osiApplication;
	}

	/**
	 * Returns the osi application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	@Override
	public OsiApplication fetchBygetOsiByCaseId(String caseId) {
		return fetchBygetOsiByCaseId(caseId, true);
	}

	/**
	 * Returns the osi application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	@Override
	public OsiApplication fetchBygetOsiByCaseId(
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

		if (result instanceof OsiApplication) {
			OsiApplication osiApplication = (OsiApplication)result;

			if (!Objects.equals(caseId, osiApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIAPPLICATION_WHERE);

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

				List<OsiApplication> list = query.list();

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
								"OsiApplicationPersistenceImpl.fetchBygetOsiByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiApplication osiApplication = list.get(0);

					result = osiApplication;

					cacheResult(osiApplication);
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
			return (OsiApplication)result;
		}
	}

	/**
	 * Removes the osi application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi application that was removed
	 */
	@Override
	public OsiApplication removeBygetOsiByCaseId(String caseId)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = findBygetOsiByCaseId(caseId);

		return remove(osiApplication);
	}

	/**
	 * Returns the number of osi applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi applications
	 */
	@Override
	public int countBygetOsiByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOsiByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIAPPLICATION_WHERE);

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
		"osiApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETOSIBYCASEID_CASEID_3 =
		"(osiApplication.caseId IS NULL OR osiApplication.caseId = '')";

	private FinderPath _finderPathFetchBygetOsiByAT_AppNo;
	private FinderPath _finderPathCountBygetOsiByAT_AppNo;

	/**
	 * Returns the osi application where applicationType = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchOsiApplicationException</code> if it could not be found.
	 *
	 * @param applicationType the application type
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	@Override
	public OsiApplication findBygetOsiByAT_AppNo(
			String applicationType, String expiredLicenseAppNumber)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = fetchBygetOsiByAT_AppNo(
			applicationType, expiredLicenseAppNumber);

		if (osiApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationType=");
			sb.append(applicationType);

			sb.append(", expiredLicenseAppNumber=");
			sb.append(expiredLicenseAppNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiApplicationException(sb.toString());
		}

		return osiApplication;
	}

	/**
	 * Returns the osi application where applicationType = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationType the application type
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	@Override
	public OsiApplication fetchBygetOsiByAT_AppNo(
		String applicationType, String expiredLicenseAppNumber) {

		return fetchBygetOsiByAT_AppNo(
			applicationType, expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the osi application where applicationType = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationType the application type
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	@Override
	public OsiApplication fetchBygetOsiByAT_AppNo(
		String applicationType, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		applicationType = Objects.toString(applicationType, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				applicationType, expiredLicenseAppNumber
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiByAT_AppNo, finderArgs, this);
		}

		if (result instanceof OsiApplication) {
			OsiApplication osiApplication = (OsiApplication)result;

			if (!Objects.equals(
					applicationType, osiApplication.getApplicationType()) ||
				!Objects.equals(
					expiredLicenseAppNumber,
					osiApplication.getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OSIAPPLICATION_WHERE);

			boolean bindApplicationType = false;

			if (applicationType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSIBYAT_APPNO_APPLICATIONTYPE_3);
			}
			else {
				bindApplicationType = true;

				sb.append(_FINDER_COLUMN_GETOSIBYAT_APPNO_APPLICATIONTYPE_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSIBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETOSIBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationType) {
					queryPos.add(applicationType);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
				}

				List<OsiApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiByAT_AppNo, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									applicationType, expiredLicenseAppNumber
								};
							}

							_log.warn(
								"OsiApplicationPersistenceImpl.fetchBygetOsiByAT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiApplication osiApplication = list.get(0);

					result = osiApplication;

					cacheResult(osiApplication);
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
			return (OsiApplication)result;
		}
	}

	/**
	 * Removes the osi application where applicationType = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param applicationType the application type
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the osi application that was removed
	 */
	@Override
	public OsiApplication removeBygetOsiByAT_AppNo(
			String applicationType, String expiredLicenseAppNumber)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = findBygetOsiByAT_AppNo(
			applicationType, expiredLicenseAppNumber);

		return remove(osiApplication);
	}

	/**
	 * Returns the number of osi applications where applicationType = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param applicationType the application type
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching osi applications
	 */
	@Override
	public int countBygetOsiByAT_AppNo(
		String applicationType, String expiredLicenseAppNumber) {

		applicationType = Objects.toString(applicationType, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetOsiByAT_AppNo;

		Object[] finderArgs = new Object[] {
			applicationType, expiredLicenseAppNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSIAPPLICATION_WHERE);

			boolean bindApplicationType = false;

			if (applicationType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSIBYAT_APPNO_APPLICATIONTYPE_3);
			}
			else {
				bindApplicationType = true;

				sb.append(_FINDER_COLUMN_GETOSIBYAT_APPNO_APPLICATIONTYPE_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSIBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETOSIBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationType) {
					queryPos.add(applicationType);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
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
		_FINDER_COLUMN_GETOSIBYAT_APPNO_APPLICATIONTYPE_2 =
			"osiApplication.applicationType = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOSIBYAT_APPNO_APPLICATIONTYPE_3 =
			"(osiApplication.applicationType IS NULL OR osiApplication.applicationType = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOSIBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"osiApplication.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETOSIBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(osiApplication.expiredLicenseAppNumber IS NULL OR osiApplication.expiredLicenseAppNumber = '')";

	public OsiApplicationPersistenceImpl() {
		setModelClass(OsiApplication.class);

		setModelImplClass(OsiApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(OsiApplicationTable.INSTANCE);
	}

	/**
	 * Caches the osi application in the entity cache if it is enabled.
	 *
	 * @param osiApplication the osi application
	 */
	@Override
	public void cacheResult(OsiApplication osiApplication) {
		entityCache.putResult(
			OsiApplicationImpl.class, osiApplication.getPrimaryKey(),
			osiApplication);

		finderCache.putResult(
			_finderPathFetchBygetOsiByAppNum,
			new Object[] {osiApplication.getApplicationNumber()},
			osiApplication);

		finderCache.putResult(
			_finderPathFetchBygetOsiByCaseId,
			new Object[] {osiApplication.getCaseId()}, osiApplication);

		finderCache.putResult(
			_finderPathFetchBygetOsiByAT_AppNo,
			new Object[] {
				osiApplication.getApplicationType(),
				osiApplication.getExpiredLicenseAppNumber()
			},
			osiApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi applications in the entity cache if it is enabled.
	 *
	 * @param osiApplications the osi applications
	 */
	@Override
	public void cacheResult(List<OsiApplication> osiApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiApplications.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiApplication osiApplication : osiApplications) {
			if (entityCache.getResult(
					OsiApplicationImpl.class, osiApplication.getPrimaryKey()) ==
						null) {

				cacheResult(osiApplication);
			}
		}
	}

	/**
	 * Clears the cache for all osi applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiApplicationImpl.class);

		finderCache.clearCache(OsiApplicationImpl.class);
	}

	/**
	 * Clears the cache for the osi application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OsiApplication osiApplication) {
		entityCache.removeResult(OsiApplicationImpl.class, osiApplication);
	}

	@Override
	public void clearCache(List<OsiApplication> osiApplications) {
		for (OsiApplication osiApplication : osiApplications) {
			entityCache.removeResult(OsiApplicationImpl.class, osiApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(OsiApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiApplicationModelImpl osiApplicationModelImpl) {

		Object[] args = new Object[] {
			osiApplicationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiByAppNum, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiByAppNum, args, osiApplicationModelImpl);

		args = new Object[] {osiApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetOsiByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiByCaseId, args, osiApplicationModelImpl);

		args = new Object[] {
			osiApplicationModelImpl.getApplicationType(),
			osiApplicationModelImpl.getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiByAT_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiByAT_AppNo, args, osiApplicationModelImpl);
	}

	/**
	 * Creates a new osi application with the primary key. Does not add the osi application to the database.
	 *
	 * @param osiApplicationId the primary key for the new osi application
	 * @return the new osi application
	 */
	@Override
	public OsiApplication create(long osiApplicationId) {
		OsiApplication osiApplication = new OsiApplicationImpl();

		osiApplication.setNew(true);
		osiApplication.setPrimaryKey(osiApplicationId);

		osiApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return osiApplication;
	}

	/**
	 * Removes the osi application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiApplicationId the primary key of the osi application
	 * @return the osi application that was removed
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	@Override
	public OsiApplication remove(long osiApplicationId)
		throws NoSuchOsiApplicationException {

		return remove((Serializable)osiApplicationId);
	}

	/**
	 * Removes the osi application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi application
	 * @return the osi application that was removed
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	@Override
	public OsiApplication remove(Serializable primaryKey)
		throws NoSuchOsiApplicationException {

		Session session = null;

		try {
			session = openSession();

			OsiApplication osiApplication = (OsiApplication)session.get(
				OsiApplicationImpl.class, primaryKey);

			if (osiApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiApplication);
		}
		catch (NoSuchOsiApplicationException noSuchEntityException) {
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
	protected OsiApplication removeImpl(OsiApplication osiApplication) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiApplication)) {
				osiApplication = (OsiApplication)session.get(
					OsiApplicationImpl.class,
					osiApplication.getPrimaryKeyObj());
			}

			if (osiApplication != null) {
				session.delete(osiApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiApplication != null) {
			clearCache(osiApplication);
		}

		return osiApplication;
	}

	@Override
	public OsiApplication updateImpl(OsiApplication osiApplication) {
		boolean isNew = osiApplication.isNew();

		if (!(osiApplication instanceof OsiApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiApplication implementation " +
					osiApplication.getClass());
		}

		OsiApplicationModelImpl osiApplicationModelImpl =
			(OsiApplicationModelImpl)osiApplication;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiApplication.setCreateDate(date);
			}
			else {
				osiApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiApplication.setModifiedDate(date);
			}
			else {
				osiApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiApplication);
			}
			else {
				osiApplication = (OsiApplication)session.merge(osiApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiApplicationImpl.class, osiApplicationModelImpl, false, true);

		cacheUniqueFindersCache(osiApplicationModelImpl);

		if (isNew) {
			osiApplication.setNew(false);
		}

		osiApplication.resetOriginalValues();

		return osiApplication;
	}

	/**
	 * Returns the osi application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi application
	 * @return the osi application
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	@Override
	public OsiApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiApplicationException {

		OsiApplication osiApplication = fetchByPrimaryKey(primaryKey);

		if (osiApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiApplication;
	}

	/**
	 * Returns the osi application with the primary key or throws a <code>NoSuchOsiApplicationException</code> if it could not be found.
	 *
	 * @param osiApplicationId the primary key of the osi application
	 * @return the osi application
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	@Override
	public OsiApplication findByPrimaryKey(long osiApplicationId)
		throws NoSuchOsiApplicationException {

		return findByPrimaryKey((Serializable)osiApplicationId);
	}

	/**
	 * Returns the osi application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiApplicationId the primary key of the osi application
	 * @return the osi application, or <code>null</code> if a osi application with the primary key could not be found
	 */
	@Override
	public OsiApplication fetchByPrimaryKey(long osiApplicationId) {
		return fetchByPrimaryKey((Serializable)osiApplicationId);
	}

	/**
	 * Returns all the osi applications.
	 *
	 * @return the osi applications
	 */
	@Override
	public List<OsiApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @return the range of osi applications
	 */
	@Override
	public List<OsiApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi applications
	 */
	@Override
	public List<OsiApplication> findAll(
		int start, int end,
		OrderByComparator<OsiApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi applications
	 */
	@Override
	public List<OsiApplication> findAll(
		int start, int end, OrderByComparator<OsiApplication> orderByComparator,
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

		List<OsiApplication> list = null;

		if (useFinderCache) {
			list = (List<OsiApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSIAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSIAPPLICATION;

				sql = sql.concat(OsiApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiApplication>)QueryUtil.list(
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
	 * Removes all the osi applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiApplication osiApplication : findAll()) {
			remove(osiApplication);
		}
	}

	/**
	 * Returns the number of osi applications.
	 *
	 * @return the number of osi applications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_OSIAPPLICATION);

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
		return "osiApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSIAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi application persistence.
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

		_finderPathWithPaginationFindBygetOsiByStatus_UserId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetOsiByStatus_UserId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"userId", "applicationStatus"}, true);

		_finderPathWithoutPaginationFindBygetOsiByStatus_UserId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetOsiByStatus_UserId",
				new String[] {Long.class.getName(), Integer.class.getName()},
				new String[] {"userId", "applicationStatus"}, true);

		_finderPathCountBygetOsiByStatus_UserId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOsiByStatus_UserId",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "applicationStatus"}, false);

		_finderPathWithPaginationFindBygetOsiByAppStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOsiByAppStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"applicationStatus"}, true);

		_finderPathWithoutPaginationFindBygetOsiByAppStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetOsiByAppStatus", new String[] {Integer.class.getName()},
			new String[] {"applicationStatus"}, true);

		_finderPathCountBygetOsiByAppStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOsiByAppStatus", new String[] {Integer.class.getName()},
			new String[] {"applicationStatus"}, false);

		_finderPathWithPaginationFindBygetOsiByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOsiByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetOsiByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOsiByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetOsiByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

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

		_finderPathFetchBygetOsiByAT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiByAT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"applicationType", "expiredLicenseAppNumber"}, true);

		_finderPathCountBygetOsiByAT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOsiByAT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"applicationType", "expiredLicenseAppNumber"}, false);

		OsiApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiApplicationUtil.setPersistence(null);

		entityCache.removeCache(OsiApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSIAPPLICATION =
		"SELECT osiApplication FROM OsiApplication osiApplication";

	private static final String _SQL_SELECT_OSIAPPLICATION_WHERE =
		"SELECT osiApplication FROM OsiApplication osiApplication WHERE ";

	private static final String _SQL_COUNT_OSIAPPLICATION =
		"SELECT COUNT(osiApplication) FROM OsiApplication osiApplication";

	private static final String _SQL_COUNT_OSIAPPLICATION_WHERE =
		"SELECT COUNT(osiApplication) FROM OsiApplication osiApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "osiApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiApplicationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}