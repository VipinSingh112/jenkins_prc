/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.persistence.impl;

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

import com.nbp.factories.registration.application.form.services.exception.NoSuchFactoriesApplicationRegistrationException;
import com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration;
import com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistrationTable;
import com.nbp.factories.registration.application.form.services.model.impl.FactoriesApplicationRegistrationImpl;
import com.nbp.factories.registration.application.form.services.model.impl.FactoriesApplicationRegistrationModelImpl;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesApplicationRegistrationPersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesApplicationRegistrationUtil;
import com.nbp.factories.registration.application.form.services.service.persistence.impl.constants.FACTORIESPersistenceConstants;

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
 * The persistence implementation for the factories application registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FactoriesApplicationRegistrationPersistence.class)
public class FactoriesApplicationRegistrationPersistenceImpl
	extends BasePersistenceImpl<FactoriesApplicationRegistration>
	implements FactoriesApplicationRegistrationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FactoriesApplicationRegistrationUtil</code> to access the factories application registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FactoriesApplicationRegistrationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFactoriesRegistrationById;
	private FinderPath _finderPathCountBygetFactoriesRegistrationById;

	/**
	 * Returns the factories application registration where factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration findBygetFactoriesRegistrationById(
			long factoriesApplicationId)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			fetchBygetFactoriesRegistrationById(factoriesApplicationId);

		if (factoriesApplicationRegistration == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("factoriesApplicationId=");
			sb.append(factoriesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFactoriesApplicationRegistrationException(
				sb.toString());
		}

		return factoriesApplicationRegistration;
	}

	/**
	 * Returns the factories application registration where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration fetchBygetFactoriesRegistrationById(
		long factoriesApplicationId) {

		return fetchBygetFactoriesRegistrationById(
			factoriesApplicationId, true);
	}

	/**
	 * Returns the factories application registration where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration fetchBygetFactoriesRegistrationById(
		long factoriesApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {factoriesApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFactoriesRegistrationById, finderArgs,
				this);
		}

		if (result instanceof FactoriesApplicationRegistration) {
			FactoriesApplicationRegistration factoriesApplicationRegistration =
				(FactoriesApplicationRegistration)result;

			if (factoriesApplicationId !=
					factoriesApplicationRegistration.
						getFactoriesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYID_FACTORIESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(factoriesApplicationId);

				List<FactoriesApplicationRegistration> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFactoriesRegistrationById,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									factoriesApplicationId
								};
							}

							_log.warn(
								"FactoriesApplicationRegistrationPersistenceImpl.fetchBygetFactoriesRegistrationById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesApplicationRegistration
						factoriesApplicationRegistration = list.get(0);

					result = factoriesApplicationRegistration;

					cacheResult(factoriesApplicationRegistration);
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
			return (FactoriesApplicationRegistration)result;
		}
	}

	/**
	 * Removes the factories application registration where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories application registration that was removed
	 */
	@Override
	public FactoriesApplicationRegistration
			removeBygetFactoriesRegistrationById(long factoriesApplicationId)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			findBygetFactoriesRegistrationById(factoriesApplicationId);

		return remove(factoriesApplicationRegistration);
	}

	/**
	 * Returns the number of factories application registrations where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories application registrations
	 */
	@Override
	public int countBygetFactoriesRegistrationById(
		long factoriesApplicationId) {

		FinderPath finderPath = _finderPathCountBygetFactoriesRegistrationById;

		Object[] finderArgs = new Object[] {factoriesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYID_FACTORIESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(factoriesApplicationId);

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
		_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYID_FACTORIESAPPLICATIONID_2 =
			"factoriesApplicationRegistration.factoriesApplicationId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetFactoriesRegistrationApplicationByStatusUser;
	private FinderPath
		_finderPathWithoutPaginationFindBygetFactoriesRegistrationApplicationByStatusUser;
	private FinderPath
		_finderPathCountBygetFactoriesRegistrationApplicationByStatusUser;

	/**
	 * Returns all the factories application registrations where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching factories application registrations
	 */
	@Override
	public List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationApplicationByStatusUser(
			int status, long userId) {

		return findBygetFactoriesRegistrationApplicationByStatusUser(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories application registrations where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @return the range of matching factories application registrations
	 */
	@Override
	public List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationApplicationByStatusUser(
			int status, long userId, int start, int end) {

		return findBygetFactoriesRegistrationApplicationByStatusUser(
			status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories application registrations where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application registrations
	 */
	@Override
	public List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationApplicationByStatusUser(
			int status, long userId, int start, int end,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator) {

		return findBygetFactoriesRegistrationApplicationByStatusUser(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories application registrations where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application registrations
	 */
	@Override
	public List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationApplicationByStatusUser(
			int status, long userId, int start, int end,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator,
			boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFactoriesRegistrationApplicationByStatusUser;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetFactoriesRegistrationApplicationByStatusUser;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<FactoriesApplicationRegistration> list = null;

		if (useFinderCache) {
			list =
				(List<FactoriesApplicationRegistration>)finderCache.getResult(
					finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FactoriesApplicationRegistration
						factoriesApplicationRegistration : list) {

					if ((status !=
							factoriesApplicationRegistration.getStatus()) ||
						(userId !=
							factoriesApplicationRegistration.getUserId())) {

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

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFACTORIESREGISTRATIONAPPLICATIONBYSTATUSUSER_STATUS_2);

			sb.append(
				_FINDER_COLUMN_GETFACTORIESREGISTRATIONAPPLICATIONBYSTATUSUSER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					FactoriesApplicationRegistrationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<FactoriesApplicationRegistration>)QueryUtil.list(
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
	 * Returns the first factories application registration in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration
			findBygetFactoriesRegistrationApplicationByStatusUser_First(
				int status, long userId,
				OrderByComparator<FactoriesApplicationRegistration>
					orderByComparator)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			fetchBygetFactoriesRegistrationApplicationByStatusUser_First(
				status, userId, orderByComparator);

		if (factoriesApplicationRegistration != null) {
			return factoriesApplicationRegistration;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchFactoriesApplicationRegistrationException(
			sb.toString());
	}

	/**
	 * Returns the first factories application registration in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationApplicationByStatusUser_First(
			int status, long userId,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator) {

		List<FactoriesApplicationRegistration> list =
			findBygetFactoriesRegistrationApplicationByStatusUser(
				status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last factories application registration in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration
			findBygetFactoriesRegistrationApplicationByStatusUser_Last(
				int status, long userId,
				OrderByComparator<FactoriesApplicationRegistration>
					orderByComparator)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			fetchBygetFactoriesRegistrationApplicationByStatusUser_Last(
				status, userId, orderByComparator);

		if (factoriesApplicationRegistration != null) {
			return factoriesApplicationRegistration;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchFactoriesApplicationRegistrationException(
			sb.toString());
	}

	/**
	 * Returns the last factories application registration in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationApplicationByStatusUser_Last(
			int status, long userId,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator) {

		int count = countBygetFactoriesRegistrationApplicationByStatusUser(
			status, userId);

		if (count == 0) {
			return null;
		}

		List<FactoriesApplicationRegistration> list =
			findBygetFactoriesRegistrationApplicationByStatusUser(
				status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the factories application registrations before and after the current factories application registration in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param factoriesApplicationId the primary key of the current factories application registration
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a factories application registration with the primary key could not be found
	 */
	@Override
	public FactoriesApplicationRegistration[]
			findBygetFactoriesRegistrationApplicationByStatusUser_PrevAndNext(
				long factoriesApplicationId, int status, long userId,
				OrderByComparator<FactoriesApplicationRegistration>
					orderByComparator)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			findByPrimaryKey(factoriesApplicationId);

		Session session = null;

		try {
			session = openSession();

			FactoriesApplicationRegistration[] array =
				new FactoriesApplicationRegistrationImpl[3];

			array[0] =
				getBygetFactoriesRegistrationApplicationByStatusUser_PrevAndNext(
					session, factoriesApplicationRegistration, status, userId,
					orderByComparator, true);

			array[1] = factoriesApplicationRegistration;

			array[2] =
				getBygetFactoriesRegistrationApplicationByStatusUser_PrevAndNext(
					session, factoriesApplicationRegistration, status, userId,
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

	protected FactoriesApplicationRegistration
		getBygetFactoriesRegistrationApplicationByStatusUser_PrevAndNext(
			Session session,
			FactoriesApplicationRegistration factoriesApplicationRegistration,
			int status, long userId,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator,
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

		sb.append(_SQL_SELECT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

		sb.append(
			_FINDER_COLUMN_GETFACTORIESREGISTRATIONAPPLICATIONBYSTATUSUSER_STATUS_2);

		sb.append(
			_FINDER_COLUMN_GETFACTORIESREGISTRATIONAPPLICATIONBYSTATUSUSER_USERID_2);

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
			sb.append(FactoriesApplicationRegistrationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		queryPos.add(userId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						factoriesApplicationRegistration)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FactoriesApplicationRegistration> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the factories application registrations where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetFactoriesRegistrationApplicationByStatusUser(
		int status, long userId) {

		for (FactoriesApplicationRegistration factoriesApplicationRegistration :
				findBygetFactoriesRegistrationApplicationByStatusUser(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(factoriesApplicationRegistration);
		}
	}

	/**
	 * Returns the number of factories application registrations where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching factories application registrations
	 */
	@Override
	public int countBygetFactoriesRegistrationApplicationByStatusUser(
		int status, long userId) {

		FinderPath finderPath =
			_finderPathCountBygetFactoriesRegistrationApplicationByStatusUser;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFACTORIESREGISTRATIONAPPLICATIONBYSTATUSUSER_STATUS_2);

			sb.append(
				_FINDER_COLUMN_GETFACTORIESREGISTRATIONAPPLICATIONBYSTATUSUSER_USERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

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
		_FINDER_COLUMN_GETFACTORIESREGISTRATIONAPPLICATIONBYSTATUSUSER_STATUS_2 =
			"factoriesApplicationRegistration.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFACTORIESREGISTRATIONAPPLICATIONBYSTATUSUSER_USERID_2 =
			"factoriesApplicationRegistration.userId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetFactoriesRegistrationByStatus;
	private FinderPath
		_finderPathWithoutPaginationFindBygetFactoriesRegistrationByStatus;
	private FinderPath _finderPathCountBygetFactoriesRegistrationByStatus;

	/**
	 * Returns all the factories application registrations where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching factories application registrations
	 */
	@Override
	public List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationByStatus(int status) {

		return findBygetFactoriesRegistrationByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories application registrations where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @return the range of matching factories application registrations
	 */
	@Override
	public List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationByStatus(int status, int start, int end) {

		return findBygetFactoriesRegistrationByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories application registrations where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application registrations
	 */
	@Override
	public List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationByStatus(
			int status, int start, int end,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator) {

		return findBygetFactoriesRegistrationByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories application registrations where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application registrations
	 */
	@Override
	public List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationByStatus(
			int status, int start, int end,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator,
			boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFactoriesRegistrationByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetFactoriesRegistrationByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<FactoriesApplicationRegistration> list = null;

		if (useFinderCache) {
			list =
				(List<FactoriesApplicationRegistration>)finderCache.getResult(
					finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FactoriesApplicationRegistration
						factoriesApplicationRegistration : list) {

					if (status !=
							factoriesApplicationRegistration.getStatus()) {

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

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					FactoriesApplicationRegistrationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<FactoriesApplicationRegistration>)QueryUtil.list(
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
	 * Returns the first factories application registration in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration
			findBygetFactoriesRegistrationByStatus_First(
				int status,
				OrderByComparator<FactoriesApplicationRegistration>
					orderByComparator)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			fetchBygetFactoriesRegistrationByStatus_First(
				status, orderByComparator);

		if (factoriesApplicationRegistration != null) {
			return factoriesApplicationRegistration;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchFactoriesApplicationRegistrationException(
			sb.toString());
	}

	/**
	 * Returns the first factories application registration in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByStatus_First(
			int status,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator) {

		List<FactoriesApplicationRegistration> list =
			findBygetFactoriesRegistrationByStatus(
				status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last factories application registration in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration
			findBygetFactoriesRegistrationByStatus_Last(
				int status,
				OrderByComparator<FactoriesApplicationRegistration>
					orderByComparator)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			fetchBygetFactoriesRegistrationByStatus_Last(
				status, orderByComparator);

		if (factoriesApplicationRegistration != null) {
			return factoriesApplicationRegistration;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchFactoriesApplicationRegistrationException(
			sb.toString());
	}

	/**
	 * Returns the last factories application registration in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByStatus_Last(
			int status,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator) {

		int count = countBygetFactoriesRegistrationByStatus(status);

		if (count == 0) {
			return null;
		}

		List<FactoriesApplicationRegistration> list =
			findBygetFactoriesRegistrationByStatus(
				status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the factories application registrations before and after the current factories application registration in the ordered set where status = &#63;.
	 *
	 * @param factoriesApplicationId the primary key of the current factories application registration
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a factories application registration with the primary key could not be found
	 */
	@Override
	public FactoriesApplicationRegistration[]
			findBygetFactoriesRegistrationByStatus_PrevAndNext(
				long factoriesApplicationId, int status,
				OrderByComparator<FactoriesApplicationRegistration>
					orderByComparator)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			findByPrimaryKey(factoriesApplicationId);

		Session session = null;

		try {
			session = openSession();

			FactoriesApplicationRegistration[] array =
				new FactoriesApplicationRegistrationImpl[3];

			array[0] = getBygetFactoriesRegistrationByStatus_PrevAndNext(
				session, factoriesApplicationRegistration, status,
				orderByComparator, true);

			array[1] = factoriesApplicationRegistration;

			array[2] = getBygetFactoriesRegistrationByStatus_PrevAndNext(
				session, factoriesApplicationRegistration, status,
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

	protected FactoriesApplicationRegistration
		getBygetFactoriesRegistrationByStatus_PrevAndNext(
			Session session,
			FactoriesApplicationRegistration factoriesApplicationRegistration,
			int status,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator,
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

		sb.append(_SQL_SELECT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

		sb.append(_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYSTATUS_STATUS_2);

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
			sb.append(FactoriesApplicationRegistrationModelImpl.ORDER_BY_JPQL);
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
						factoriesApplicationRegistration)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FactoriesApplicationRegistration> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the factories application registrations where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetFactoriesRegistrationByStatus(int status) {
		for (FactoriesApplicationRegistration factoriesApplicationRegistration :
				findBygetFactoriesRegistrationByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(factoriesApplicationRegistration);
		}
	}

	/**
	 * Returns the number of factories application registrations where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching factories application registrations
	 */
	@Override
	public int countBygetFactoriesRegistrationByStatus(int status) {
		FinderPath finderPath =
			_finderPathCountBygetFactoriesRegistrationByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYSTATUS_STATUS_2);

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
		_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYSTATUS_STATUS_2 =
			"factoriesApplicationRegistration.status = ?";

	private FinderPath _finderPathFetchBygetFactoriesRegistrationByAppNo;
	private FinderPath _finderPathCountBygetFactoriesRegistrationByAppNo;

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration
			findBygetFactoriesRegistrationByAppNo(String applicationNumber)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			fetchBygetFactoriesRegistrationByAppNo(applicationNumber);

		if (factoriesApplicationRegistration == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFactoriesApplicationRegistrationException(
				sb.toString());
		}

		return factoriesApplicationRegistration;
	}

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByAppNo(String applicationNumber) {

		return fetchBygetFactoriesRegistrationByAppNo(applicationNumber, true);
	}

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByAppNo(
			String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFactoriesRegistrationByAppNo, finderArgs,
				this);
		}

		if (result instanceof FactoriesApplicationRegistration) {
			FactoriesApplicationRegistration factoriesApplicationRegistration =
				(FactoriesApplicationRegistration)result;

			if (!Objects.equals(
					applicationNumber,
					factoriesApplicationRegistration.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYAPPNO_APPLICATIONNUMBER_2);
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

				List<FactoriesApplicationRegistration> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFactoriesRegistrationByAppNo,
							finderArgs, list);
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
								"FactoriesApplicationRegistrationPersistenceImpl.fetchBygetFactoriesRegistrationByAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesApplicationRegistration
						factoriesApplicationRegistration = list.get(0);

					result = factoriesApplicationRegistration;

					cacheResult(factoriesApplicationRegistration);
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
			return (FactoriesApplicationRegistration)result;
		}
	}

	/**
	 * Removes the factories application registration where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the factories application registration that was removed
	 */
	@Override
	public FactoriesApplicationRegistration
			removeBygetFactoriesRegistrationByAppNo(String applicationNumber)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			findBygetFactoriesRegistrationByAppNo(applicationNumber);

		return remove(factoriesApplicationRegistration);
	}

	/**
	 * Returns the number of factories application registrations where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching factories application registrations
	 */
	@Override
	public int countBygetFactoriesRegistrationByAppNo(
		String applicationNumber) {

		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath =
			_finderPathCountBygetFactoriesRegistrationByAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYAPPNO_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYAPPNO_APPLICATIONNUMBER_2 =
			"factoriesApplicationRegistration.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYAPPNO_APPLICATIONNUMBER_3 =
			"(factoriesApplicationRegistration.applicationNumber IS NULL OR factoriesApplicationRegistration.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetFactoriesRegistrationByCaseId;
	private FinderPath _finderPathCountBygetFactoriesRegistrationByCaseId;

	/**
	 * Returns the factories application registration where caseId = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration
			findBygetFactoriesRegistrationByCaseId(String caseId)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			fetchBygetFactoriesRegistrationByCaseId(caseId);

		if (factoriesApplicationRegistration == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFactoriesApplicationRegistrationException(
				sb.toString());
		}

		return factoriesApplicationRegistration;
	}

	/**
	 * Returns the factories application registration where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByCaseId(String caseId) {

		return fetchBygetFactoriesRegistrationByCaseId(caseId, true);
	}

	/**
	 * Returns the factories application registration where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByCaseId(
			String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFactoriesRegistrationByCaseId, finderArgs,
				this);
		}

		if (result instanceof FactoriesApplicationRegistration) {
			FactoriesApplicationRegistration factoriesApplicationRegistration =
				(FactoriesApplicationRegistration)result;

			if (!Objects.equals(
					caseId, factoriesApplicationRegistration.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYCASEID_CASEID_2);
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

				List<FactoriesApplicationRegistration> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFactoriesRegistrationByCaseId,
							finderArgs, list);
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
								"FactoriesApplicationRegistrationPersistenceImpl.fetchBygetFactoriesRegistrationByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesApplicationRegistration
						factoriesApplicationRegistration = list.get(0);

					result = factoriesApplicationRegistration;

					cacheResult(factoriesApplicationRegistration);
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
			return (FactoriesApplicationRegistration)result;
		}
	}

	/**
	 * Removes the factories application registration where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories application registration that was removed
	 */
	@Override
	public FactoriesApplicationRegistration
			removeBygetFactoriesRegistrationByCaseId(String caseId)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			findBygetFactoriesRegistrationByCaseId(caseId);

		return remove(factoriesApplicationRegistration);
	}

	/**
	 * Returns the number of factories application registrations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories application registrations
	 */
	@Override
	public int countBygetFactoriesRegistrationByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetFactoriesRegistrationByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYCASEID_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYCASEID_CASEID_2 =
			"factoriesApplicationRegistration.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETFACTORIESREGISTRATIONBYCASEID_CASEID_3 =
			"(factoriesApplicationRegistration.caseId IS NULL OR factoriesApplicationRegistration.caseId = '')";

	private FinderPath _finderPathFetchBygetFactoriesRegstBy_AppNo;
	private FinderPath _finderPathCountBygetFactoriesRegstBy_AppNo;

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration findBygetFactoriesRegstBy_AppNo(
			String applicationNumber)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			fetchBygetFactoriesRegstBy_AppNo(applicationNumber);

		if (factoriesApplicationRegistration == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFactoriesApplicationRegistrationException(
				sb.toString());
		}

		return factoriesApplicationRegistration;
	}

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration fetchBygetFactoriesRegstBy_AppNo(
		String applicationNumber) {

		return fetchBygetFactoriesRegstBy_AppNo(applicationNumber, true);
	}

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration fetchBygetFactoriesRegstBy_AppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFactoriesRegstBy_AppNo, finderArgs, this);
		}

		if (result instanceof FactoriesApplicationRegistration) {
			FactoriesApplicationRegistration factoriesApplicationRegistration =
				(FactoriesApplicationRegistration)result;

			if (!Objects.equals(
					applicationNumber,
					factoriesApplicationRegistration.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGSTBY_APPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGSTBY_APPNO_APPLICATIONNUMBER_2);
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

				List<FactoriesApplicationRegistration> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFactoriesRegstBy_AppNo,
							finderArgs, list);
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
								"FactoriesApplicationRegistrationPersistenceImpl.fetchBygetFactoriesRegstBy_AppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesApplicationRegistration
						factoriesApplicationRegistration = list.get(0);

					result = factoriesApplicationRegistration;

					cacheResult(factoriesApplicationRegistration);
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
			return (FactoriesApplicationRegistration)result;
		}
	}

	/**
	 * Removes the factories application registration where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the factories application registration that was removed
	 */
	@Override
	public FactoriesApplicationRegistration removeBygetFactoriesRegstBy_AppNo(
			String applicationNumber)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			findBygetFactoriesRegstBy_AppNo(applicationNumber);

		return remove(factoriesApplicationRegistration);
	}

	/**
	 * Returns the number of factories application registrations where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching factories application registrations
	 */
	@Override
	public int countBygetFactoriesRegstBy_AppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetFactoriesRegstBy_AppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGSTBY_APPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGSTBY_APPNO_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETFACTORIESREGSTBY_APPNO_APPLICATIONNUMBER_2 =
			"factoriesApplicationRegistration.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETFACTORIESREGSTBY_APPNO_APPLICATIONNUMBER_3 =
			"(factoriesApplicationRegistration.applicationNumber IS NULL OR factoriesApplicationRegistration.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetFactoriesRegstBy_CaseId;
	private FinderPath _finderPathCountBygetFactoriesRegstBy_CaseId;

	/**
	 * Returns the factories application registration where caseId = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration findBygetFactoriesRegstBy_CaseId(
			String caseId)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			fetchBygetFactoriesRegstBy_CaseId(caseId);

		if (factoriesApplicationRegistration == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFactoriesApplicationRegistrationException(
				sb.toString());
		}

		return factoriesApplicationRegistration;
	}

	/**
	 * Returns the factories application registration where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration fetchBygetFactoriesRegstBy_CaseId(
		String caseId) {

		return fetchBygetFactoriesRegstBy_CaseId(caseId, true);
	}

	/**
	 * Returns the factories application registration where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration fetchBygetFactoriesRegstBy_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFactoriesRegstBy_CaseId, finderArgs, this);
		}

		if (result instanceof FactoriesApplicationRegistration) {
			FactoriesApplicationRegistration factoriesApplicationRegistration =
				(FactoriesApplicationRegistration)result;

			if (!Objects.equals(
					caseId, factoriesApplicationRegistration.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORIESREGSTBY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFACTORIESREGSTBY_CASEID_CASEID_2);
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

				List<FactoriesApplicationRegistration> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFactoriesRegstBy_CaseId,
							finderArgs, list);
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
								"FactoriesApplicationRegistrationPersistenceImpl.fetchBygetFactoriesRegstBy_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesApplicationRegistration
						factoriesApplicationRegistration = list.get(0);

					result = factoriesApplicationRegistration;

					cacheResult(factoriesApplicationRegistration);
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
			return (FactoriesApplicationRegistration)result;
		}
	}

	/**
	 * Removes the factories application registration where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories application registration that was removed
	 */
	@Override
	public FactoriesApplicationRegistration removeBygetFactoriesRegstBy_CaseId(
			String caseId)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			findBygetFactoriesRegstBy_CaseId(caseId);

		return remove(factoriesApplicationRegistration);
	}

	/**
	 * Returns the number of factories application registrations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories application registrations
	 */
	@Override
	public int countBygetFactoriesRegstBy_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFactoriesRegstBy_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORIESREGSTBY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFACTORIESREGSTBY_CASEID_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETFACTORIESREGSTBY_CASEID_CASEID_2 =
			"factoriesApplicationRegistration.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETFACTORIESREGSTBY_CASEID_CASEID_3 =
			"(factoriesApplicationRegistration.caseId IS NULL OR factoriesApplicationRegistration.caseId = '')";

	private FinderPath _finderPathFetchBygetFactoriesRegstByAT_AppNo;
	private FinderPath _finderPathCountBygetFactoriesRegstByAT_AppNo;

	/**
	 * Returns the factories application registration where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration findBygetFactoriesRegstByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			fetchBygetFactoriesRegstByAT_AppNo(
				typeOfTransaction, expiredLicenseAppNumber);

		if (factoriesApplicationRegistration == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("typeOfTransaction=");
			sb.append(typeOfTransaction);

			sb.append(", expiredLicenseAppNumber=");
			sb.append(expiredLicenseAppNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFactoriesApplicationRegistrationException(
				sb.toString());
		}

		return factoriesApplicationRegistration;
	}

	/**
	 * Returns the factories application registration where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration fetchBygetFactoriesRegstByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return fetchBygetFactoriesRegstByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the factories application registration where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	@Override
	public FactoriesApplicationRegistration fetchBygetFactoriesRegstByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		typeOfTransaction = Objects.toString(typeOfTransaction, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				typeOfTransaction, expiredLicenseAppNumber
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFactoriesRegstByAT_AppNo, finderArgs,
				this);
		}

		if (result instanceof FactoriesApplicationRegistration) {
			FactoriesApplicationRegistration factoriesApplicationRegistration =
				(FactoriesApplicationRegistration)result;

			if (!Objects.equals(
					typeOfTransaction,
					factoriesApplicationRegistration.getTypeOfTransaction()) ||
				!Objects.equals(
					expiredLicenseAppNumber,
					factoriesApplicationRegistration.
						getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGSTBYAT_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGSTBYAT_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTypeOfTransaction) {
					queryPos.add(typeOfTransaction);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
				}

				List<FactoriesApplicationRegistration> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFactoriesRegstByAT_AppNo,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									typeOfTransaction, expiredLicenseAppNumber
								};
							}

							_log.warn(
								"FactoriesApplicationRegistrationPersistenceImpl.fetchBygetFactoriesRegstByAT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesApplicationRegistration
						factoriesApplicationRegistration = list.get(0);

					result = factoriesApplicationRegistration;

					cacheResult(factoriesApplicationRegistration);
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
			return (FactoriesApplicationRegistration)result;
		}
	}

	/**
	 * Removes the factories application registration where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the factories application registration that was removed
	 */
	@Override
	public FactoriesApplicationRegistration removeBygetFactoriesRegstByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			findBygetFactoriesRegstByAT_AppNo(
				typeOfTransaction, expiredLicenseAppNumber);

		return remove(factoriesApplicationRegistration);
	}

	/**
	 * Returns the number of factories application registrations where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching factories application registrations
	 */
	@Override
	public int countBygetFactoriesRegstByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		typeOfTransaction = Objects.toString(typeOfTransaction, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetFactoriesRegstByAT_AppNo;

		Object[] finderArgs = new Object[] {
			typeOfTransaction, expiredLicenseAppNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONREGISTRATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGSTBYAT_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGSTBYAT_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIESREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTypeOfTransaction) {
					queryPos.add(typeOfTransaction);
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
		_FINDER_COLUMN_GETFACTORIESREGSTBYAT_APPNO_TYPEOFTRANSACTION_2 =
			"factoriesApplicationRegistration.typeOfTransaction = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFACTORIESREGSTBYAT_APPNO_TYPEOFTRANSACTION_3 =
			"(factoriesApplicationRegistration.typeOfTransaction IS NULL OR factoriesApplicationRegistration.typeOfTransaction = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFACTORIESREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"factoriesApplicationRegistration.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETFACTORIESREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(factoriesApplicationRegistration.expiredLicenseAppNumber IS NULL OR factoriesApplicationRegistration.expiredLicenseAppNumber = '')";

	public FactoriesApplicationRegistrationPersistenceImpl() {
		setModelClass(FactoriesApplicationRegistration.class);

		setModelImplClass(FactoriesApplicationRegistrationImpl.class);
		setModelPKClass(long.class);

		setTable(FactoriesApplicationRegistrationTable.INSTANCE);
	}

	/**
	 * Caches the factories application registration in the entity cache if it is enabled.
	 *
	 * @param factoriesApplicationRegistration the factories application registration
	 */
	@Override
	public void cacheResult(
		FactoriesApplicationRegistration factoriesApplicationRegistration) {

		entityCache.putResult(
			FactoriesApplicationRegistrationImpl.class,
			factoriesApplicationRegistration.getPrimaryKey(),
			factoriesApplicationRegistration);

		finderCache.putResult(
			_finderPathFetchBygetFactoriesRegistrationById,
			new Object[] {
				factoriesApplicationRegistration.getFactoriesApplicationId()
			},
			factoriesApplicationRegistration);

		finderCache.putResult(
			_finderPathFetchBygetFactoriesRegistrationByAppNo,
			new Object[] {
				factoriesApplicationRegistration.getApplicationNumber()
			},
			factoriesApplicationRegistration);

		finderCache.putResult(
			_finderPathFetchBygetFactoriesRegistrationByCaseId,
			new Object[] {factoriesApplicationRegistration.getCaseId()},
			factoriesApplicationRegistration);

		finderCache.putResult(
			_finderPathFetchBygetFactoriesRegstBy_AppNo,
			new Object[] {
				factoriesApplicationRegistration.getApplicationNumber()
			},
			factoriesApplicationRegistration);

		finderCache.putResult(
			_finderPathFetchBygetFactoriesRegstBy_CaseId,
			new Object[] {factoriesApplicationRegistration.getCaseId()},
			factoriesApplicationRegistration);

		finderCache.putResult(
			_finderPathFetchBygetFactoriesRegstByAT_AppNo,
			new Object[] {
				factoriesApplicationRegistration.getTypeOfTransaction(),
				factoriesApplicationRegistration.getExpiredLicenseAppNumber()
			},
			factoriesApplicationRegistration);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the factories application registrations in the entity cache if it is enabled.
	 *
	 * @param factoriesApplicationRegistrations the factories application registrations
	 */
	@Override
	public void cacheResult(
		List<FactoriesApplicationRegistration>
			factoriesApplicationRegistrations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (factoriesApplicationRegistrations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FactoriesApplicationRegistration factoriesApplicationRegistration :
				factoriesApplicationRegistrations) {

			if (entityCache.getResult(
					FactoriesApplicationRegistrationImpl.class,
					factoriesApplicationRegistration.getPrimaryKey()) == null) {

				cacheResult(factoriesApplicationRegistration);
			}
		}
	}

	/**
	 * Clears the cache for all factories application registrations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FactoriesApplicationRegistrationImpl.class);

		finderCache.clearCache(FactoriesApplicationRegistrationImpl.class);
	}

	/**
	 * Clears the cache for the factories application registration.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FactoriesApplicationRegistration factoriesApplicationRegistration) {

		entityCache.removeResult(
			FactoriesApplicationRegistrationImpl.class,
			factoriesApplicationRegistration);
	}

	@Override
	public void clearCache(
		List<FactoriesApplicationRegistration>
			factoriesApplicationRegistrations) {

		for (FactoriesApplicationRegistration factoriesApplicationRegistration :
				factoriesApplicationRegistrations) {

			entityCache.removeResult(
				FactoriesApplicationRegistrationImpl.class,
				factoriesApplicationRegistration);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FactoriesApplicationRegistrationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FactoriesApplicationRegistrationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FactoriesApplicationRegistrationModelImpl
			factoriesApplicationRegistrationModelImpl) {

		Object[] args = new Object[] {
			factoriesApplicationRegistrationModelImpl.
				getFactoriesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFactoriesRegistrationById, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFactoriesRegistrationById, args,
			factoriesApplicationRegistrationModelImpl);

		args = new Object[] {
			factoriesApplicationRegistrationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetFactoriesRegistrationByAppNo, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFactoriesRegistrationByAppNo, args,
			factoriesApplicationRegistrationModelImpl);

		args = new Object[] {
			factoriesApplicationRegistrationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetFactoriesRegistrationByCaseId, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFactoriesRegistrationByCaseId, args,
			factoriesApplicationRegistrationModelImpl);

		args = new Object[] {
			factoriesApplicationRegistrationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetFactoriesRegstBy_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFactoriesRegstBy_AppNo, args,
			factoriesApplicationRegistrationModelImpl);

		args = new Object[] {
			factoriesApplicationRegistrationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetFactoriesRegstBy_CaseId, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFactoriesRegstBy_CaseId, args,
			factoriesApplicationRegistrationModelImpl);

		args = new Object[] {
			factoriesApplicationRegistrationModelImpl.getTypeOfTransaction(),
			factoriesApplicationRegistrationModelImpl.
				getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetFactoriesRegstByAT_AppNo, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFactoriesRegstByAT_AppNo, args,
			factoriesApplicationRegistrationModelImpl);
	}

	/**
	 * Creates a new factories application registration with the primary key. Does not add the factories application registration to the database.
	 *
	 * @param factoriesApplicationId the primary key for the new factories application registration
	 * @return the new factories application registration
	 */
	@Override
	public FactoriesApplicationRegistration create(
		long factoriesApplicationId) {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			new FactoriesApplicationRegistrationImpl();

		factoriesApplicationRegistration.setNew(true);
		factoriesApplicationRegistration.setPrimaryKey(factoriesApplicationId);

		factoriesApplicationRegistration.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return factoriesApplicationRegistration;
	}

	/**
	 * Removes the factories application registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesApplicationId the primary key of the factories application registration
	 * @return the factories application registration that was removed
	 * @throws NoSuchFactoriesApplicationRegistrationException if a factories application registration with the primary key could not be found
	 */
	@Override
	public FactoriesApplicationRegistration remove(long factoriesApplicationId)
		throws NoSuchFactoriesApplicationRegistrationException {

		return remove((Serializable)factoriesApplicationId);
	}

	/**
	 * Removes the factories application registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the factories application registration
	 * @return the factories application registration that was removed
	 * @throws NoSuchFactoriesApplicationRegistrationException if a factories application registration with the primary key could not be found
	 */
	@Override
	public FactoriesApplicationRegistration remove(Serializable primaryKey)
		throws NoSuchFactoriesApplicationRegistrationException {

		Session session = null;

		try {
			session = openSession();

			FactoriesApplicationRegistration factoriesApplicationRegistration =
				(FactoriesApplicationRegistration)session.get(
					FactoriesApplicationRegistrationImpl.class, primaryKey);

			if (factoriesApplicationRegistration == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFactoriesApplicationRegistrationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(factoriesApplicationRegistration);
		}
		catch (NoSuchFactoriesApplicationRegistrationException
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
	protected FactoriesApplicationRegistration removeImpl(
		FactoriesApplicationRegistration factoriesApplicationRegistration) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(factoriesApplicationRegistration)) {
				factoriesApplicationRegistration =
					(FactoriesApplicationRegistration)session.get(
						FactoriesApplicationRegistrationImpl.class,
						factoriesApplicationRegistration.getPrimaryKeyObj());
			}

			if (factoriesApplicationRegistration != null) {
				session.delete(factoriesApplicationRegistration);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (factoriesApplicationRegistration != null) {
			clearCache(factoriesApplicationRegistration);
		}

		return factoriesApplicationRegistration;
	}

	@Override
	public FactoriesApplicationRegistration updateImpl(
		FactoriesApplicationRegistration factoriesApplicationRegistration) {

		boolean isNew = factoriesApplicationRegistration.isNew();

		if (!(factoriesApplicationRegistration instanceof
				FactoriesApplicationRegistrationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					factoriesApplicationRegistration.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					factoriesApplicationRegistration);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in factoriesApplicationRegistration proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FactoriesApplicationRegistration implementation " +
					factoriesApplicationRegistration.getClass());
		}

		FactoriesApplicationRegistrationModelImpl
			factoriesApplicationRegistrationModelImpl =
				(FactoriesApplicationRegistrationModelImpl)
					factoriesApplicationRegistration;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(factoriesApplicationRegistration.getCreateDate() == null)) {

			if (serviceContext == null) {
				factoriesApplicationRegistration.setCreateDate(date);
			}
			else {
				factoriesApplicationRegistration.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!factoriesApplicationRegistrationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				factoriesApplicationRegistration.setModifiedDate(date);
			}
			else {
				factoriesApplicationRegistration.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(factoriesApplicationRegistration);
			}
			else {
				factoriesApplicationRegistration =
					(FactoriesApplicationRegistration)session.merge(
						factoriesApplicationRegistration);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FactoriesApplicationRegistrationImpl.class,
			factoriesApplicationRegistrationModelImpl, false, true);

		cacheUniqueFindersCache(factoriesApplicationRegistrationModelImpl);

		if (isNew) {
			factoriesApplicationRegistration.setNew(false);
		}

		factoriesApplicationRegistration.resetOriginalValues();

		return factoriesApplicationRegistration;
	}

	/**
	 * Returns the factories application registration with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the factories application registration
	 * @return the factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a factories application registration with the primary key could not be found
	 */
	@Override
	public FactoriesApplicationRegistration findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchFactoriesApplicationRegistrationException {

		FactoriesApplicationRegistration factoriesApplicationRegistration =
			fetchByPrimaryKey(primaryKey);

		if (factoriesApplicationRegistration == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFactoriesApplicationRegistrationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return factoriesApplicationRegistration;
	}

	/**
	 * Returns the factories application registration with the primary key or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the primary key of the factories application registration
	 * @return the factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a factories application registration with the primary key could not be found
	 */
	@Override
	public FactoriesApplicationRegistration findByPrimaryKey(
			long factoriesApplicationId)
		throws NoSuchFactoriesApplicationRegistrationException {

		return findByPrimaryKey((Serializable)factoriesApplicationId);
	}

	/**
	 * Returns the factories application registration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the primary key of the factories application registration
	 * @return the factories application registration, or <code>null</code> if a factories application registration with the primary key could not be found
	 */
	@Override
	public FactoriesApplicationRegistration fetchByPrimaryKey(
		long factoriesApplicationId) {

		return fetchByPrimaryKey((Serializable)factoriesApplicationId);
	}

	/**
	 * Returns all the factories application registrations.
	 *
	 * @return the factories application registrations
	 */
	@Override
	public List<FactoriesApplicationRegistration> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories application registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @return the range of factories application registrations
	 */
	@Override
	public List<FactoriesApplicationRegistration> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories application registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories application registrations
	 */
	@Override
	public List<FactoriesApplicationRegistration> findAll(
		int start, int end,
		OrderByComparator<FactoriesApplicationRegistration> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories application registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories application registrations
	 */
	@Override
	public List<FactoriesApplicationRegistration> findAll(
		int start, int end,
		OrderByComparator<FactoriesApplicationRegistration> orderByComparator,
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

		List<FactoriesApplicationRegistration> list = null;

		if (useFinderCache) {
			list =
				(List<FactoriesApplicationRegistration>)finderCache.getResult(
					finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FACTORIESAPPLICATIONREGISTRATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FACTORIESAPPLICATIONREGISTRATION;

				sql = sql.concat(
					FactoriesApplicationRegistrationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FactoriesApplicationRegistration>)QueryUtil.list(
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
	 * Removes all the factories application registrations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FactoriesApplicationRegistration factoriesApplicationRegistration :
				findAll()) {

			remove(factoriesApplicationRegistration);
		}
	}

	/**
	 * Returns the number of factories application registrations.
	 *
	 * @return the number of factories application registrations
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
					_SQL_COUNT_FACTORIESAPPLICATIONREGISTRATION);

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
		return "factoriesApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FACTORIESAPPLICATIONREGISTRATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FactoriesApplicationRegistrationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the factories application registration persistence.
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

		_finderPathFetchBygetFactoriesRegistrationById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFactoriesRegistrationById",
			new String[] {Long.class.getName()},
			new String[] {"factoriesApplicationId"}, true);

		_finderPathCountBygetFactoriesRegistrationById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactoriesRegistrationById",
			new String[] {Long.class.getName()},
			new String[] {"factoriesApplicationId"}, false);

		_finderPathWithPaginationFindBygetFactoriesRegistrationApplicationByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetFactoriesRegistrationApplicationByStatusUser",
				new String[] {
					Integer.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetFactoriesRegistrationApplicationByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFactoriesRegistrationApplicationByStatusUser",
				new String[] {Integer.class.getName(), Long.class.getName()},
				new String[] {"status", "userId"}, true);

		_finderPathCountBygetFactoriesRegistrationApplicationByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetFactoriesRegistrationApplicationByStatusUser",
				new String[] {Integer.class.getName(), Long.class.getName()},
				new String[] {"status", "userId"}, false);

		_finderPathWithPaginationFindBygetFactoriesRegistrationByStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetFactoriesRegistrationByStatus",
				new String[] {
					Integer.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetFactoriesRegistrationByStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFactoriesRegistrationByStatus",
				new String[] {Integer.class.getName()}, new String[] {"status"},
				true);

		_finderPathCountBygetFactoriesRegistrationByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactoriesRegistrationByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathFetchBygetFactoriesRegistrationByAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFactoriesRegistrationByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetFactoriesRegistrationByAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactoriesRegistrationByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetFactoriesRegistrationByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFactoriesRegistrationByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFactoriesRegistrationByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactoriesRegistrationByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetFactoriesRegstBy_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFactoriesRegstBy_AppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetFactoriesRegstBy_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactoriesRegstBy_AppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetFactoriesRegstBy_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFactoriesRegstBy_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFactoriesRegstBy_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactoriesRegstBy_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetFactoriesRegstByAT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFactoriesRegstByAT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "expiredLicenseAppNumber"},
			true);

		_finderPathCountBygetFactoriesRegstByAT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactoriesRegstByAT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "expiredLicenseAppNumber"},
			false);

		FactoriesApplicationRegistrationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FactoriesApplicationRegistrationUtil.setPersistence(null);

		entityCache.removeCache(
			FactoriesApplicationRegistrationImpl.class.getName());
	}

	@Override
	@Reference(
		target = FACTORIESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FACTORIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FACTORIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FACTORIESAPPLICATIONREGISTRATION =
		"SELECT factoriesApplicationRegistration FROM FactoriesApplicationRegistration factoriesApplicationRegistration";

	private static final String
		_SQL_SELECT_FACTORIESAPPLICATIONREGISTRATION_WHERE =
			"SELECT factoriesApplicationRegistration FROM FactoriesApplicationRegistration factoriesApplicationRegistration WHERE ";

	private static final String _SQL_COUNT_FACTORIESAPPLICATIONREGISTRATION =
		"SELECT COUNT(factoriesApplicationRegistration) FROM FactoriesApplicationRegistration factoriesApplicationRegistration";

	private static final String
		_SQL_COUNT_FACTORIESAPPLICATIONREGISTRATION_WHERE =
			"SELECT COUNT(factoriesApplicationRegistration) FROM FactoriesApplicationRegistration factoriesApplicationRegistration WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"factoriesApplicationRegistration.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FactoriesApplicationRegistration exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FactoriesApplicationRegistration exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FactoriesApplicationRegistrationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}