/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service.persistence.impl;

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

import com.nbp.tourism.application.stages.services.exception.NoSuchTourismDeskVerificationException;
import com.nbp.tourism.application.stages.services.model.TourismDeskVerification;
import com.nbp.tourism.application.stages.services.model.TourismDeskVerificationTable;
import com.nbp.tourism.application.stages.services.model.impl.TourismDeskVerificationImpl;
import com.nbp.tourism.application.stages.services.model.impl.TourismDeskVerificationModelImpl;
import com.nbp.tourism.application.stages.services.service.persistence.TourismDeskVerificationPersistence;
import com.nbp.tourism.application.stages.services.service.persistence.TourismDeskVerificationUtil;
import com.nbp.tourism.application.stages.services.service.persistence.impl.constants.TOURISM_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the tourism desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismDeskVerificationPersistence.class)
public class TourismDeskVerificationPersistenceImpl
	extends BasePersistenceImpl<TourismDeskVerification>
	implements TourismDeskVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismDeskVerificationUtil</code> to access the tourism desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismDeskVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetTourismDV_ById;
	private FinderPath _finderPathWithoutPaginationFindBygetTourismDV_ById;
	private FinderPath _finderPathCountBygetTourismDV_ById;

	/**
	 * Returns all the tourism desk verifications where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism desk verifications
	 */
	@Override
	public List<TourismDeskVerification> findBygetTourismDV_ById(
		long tourismApplicationId) {

		return findBygetTourismDV_ById(
			tourismApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism desk verifications where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @return the range of matching tourism desk verifications
	 */
	@Override
	public List<TourismDeskVerification> findBygetTourismDV_ById(
		long tourismApplicationId, int start, int end) {

		return findBygetTourismDV_ById(tourismApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism desk verifications where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism desk verifications
	 */
	@Override
	public List<TourismDeskVerification> findBygetTourismDV_ById(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismDeskVerification> orderByComparator) {

		return findBygetTourismDV_ById(
			tourismApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism desk verifications where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism desk verifications
	 */
	@Override
	public List<TourismDeskVerification> findBygetTourismDV_ById(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismDeskVerification> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetTourismDV_ById;
				finderArgs = new Object[] {tourismApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetTourismDV_ById;
			finderArgs = new Object[] {
				tourismApplicationId, start, end, orderByComparator
			};
		}

		List<TourismDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<TourismDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TourismDeskVerification tourismDeskVerification : list) {
					if (tourismApplicationId !=
							tourismDeskVerification.getTourismApplicationId()) {

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

			sb.append(_SQL_SELECT_TOURISMDESKVERIFICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMDV_BYID_TOURISMAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TourismDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				list = (List<TourismDeskVerification>)QueryUtil.list(
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
	 * Returns the first tourism desk verification in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism desk verification
	 * @throws NoSuchTourismDeskVerificationException if a matching tourism desk verification could not be found
	 */
	@Override
	public TourismDeskVerification findBygetTourismDV_ById_First(
			long tourismApplicationId,
			OrderByComparator<TourismDeskVerification> orderByComparator)
		throws NoSuchTourismDeskVerificationException {

		TourismDeskVerification tourismDeskVerification =
			fetchBygetTourismDV_ById_First(
				tourismApplicationId, orderByComparator);

		if (tourismDeskVerification != null) {
			return tourismDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("tourismApplicationId=");
		sb.append(tourismApplicationId);

		sb.append("}");

		throw new NoSuchTourismDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the first tourism desk verification in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism desk verification, or <code>null</code> if a matching tourism desk verification could not be found
	 */
	@Override
	public TourismDeskVerification fetchBygetTourismDV_ById_First(
		long tourismApplicationId,
		OrderByComparator<TourismDeskVerification> orderByComparator) {

		List<TourismDeskVerification> list = findBygetTourismDV_ById(
			tourismApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tourism desk verification in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism desk verification
	 * @throws NoSuchTourismDeskVerificationException if a matching tourism desk verification could not be found
	 */
	@Override
	public TourismDeskVerification findBygetTourismDV_ById_Last(
			long tourismApplicationId,
			OrderByComparator<TourismDeskVerification> orderByComparator)
		throws NoSuchTourismDeskVerificationException {

		TourismDeskVerification tourismDeskVerification =
			fetchBygetTourismDV_ById_Last(
				tourismApplicationId, orderByComparator);

		if (tourismDeskVerification != null) {
			return tourismDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("tourismApplicationId=");
		sb.append(tourismApplicationId);

		sb.append("}");

		throw new NoSuchTourismDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the last tourism desk verification in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism desk verification, or <code>null</code> if a matching tourism desk verification could not be found
	 */
	@Override
	public TourismDeskVerification fetchBygetTourismDV_ById_Last(
		long tourismApplicationId,
		OrderByComparator<TourismDeskVerification> orderByComparator) {

		int count = countBygetTourismDV_ById(tourismApplicationId);

		if (count == 0) {
			return null;
		}

		List<TourismDeskVerification> list = findBygetTourismDV_ById(
			tourismApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tourism desk verifications before and after the current tourism desk verification in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismDeskVeriId the primary key of the current tourism desk verification
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism desk verification
	 * @throws NoSuchTourismDeskVerificationException if a tourism desk verification with the primary key could not be found
	 */
	@Override
	public TourismDeskVerification[] findBygetTourismDV_ById_PrevAndNext(
			long tourismDeskVeriId, long tourismApplicationId,
			OrderByComparator<TourismDeskVerification> orderByComparator)
		throws NoSuchTourismDeskVerificationException {

		TourismDeskVerification tourismDeskVerification = findByPrimaryKey(
			tourismDeskVeriId);

		Session session = null;

		try {
			session = openSession();

			TourismDeskVerification[] array =
				new TourismDeskVerificationImpl[3];

			array[0] = getBygetTourismDV_ById_PrevAndNext(
				session, tourismDeskVerification, tourismApplicationId,
				orderByComparator, true);

			array[1] = tourismDeskVerification;

			array[2] = getBygetTourismDV_ById_PrevAndNext(
				session, tourismDeskVerification, tourismApplicationId,
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

	protected TourismDeskVerification getBygetTourismDV_ById_PrevAndNext(
		Session session, TourismDeskVerification tourismDeskVerification,
		long tourismApplicationId,
		OrderByComparator<TourismDeskVerification> orderByComparator,
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

		sb.append(_SQL_SELECT_TOURISMDESKVERIFICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETTOURISMDV_BYID_TOURISMAPPLICATIONID_2);

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
			sb.append(TourismDeskVerificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(tourismApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						tourismDeskVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TourismDeskVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tourism desk verifications where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 */
	@Override
	public void removeBygetTourismDV_ById(long tourismApplicationId) {
		for (TourismDeskVerification tourismDeskVerification :
				findBygetTourismDV_ById(
					tourismApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(tourismDeskVerification);
		}
	}

	/**
	 * Returns the number of tourism desk verifications where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism desk verifications
	 */
	@Override
	public int countBygetTourismDV_ById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismDV_ById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMDESKVERIFICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMDV_BYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

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
		_FINDER_COLUMN_GETTOURISMDV_BYID_TOURISMAPPLICATIONID_2 =
			"tourismDeskVerification.tourismApplicationId = ?";

	public TourismDeskVerificationPersistenceImpl() {
		setModelClass(TourismDeskVerification.class);

		setModelImplClass(TourismDeskVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(TourismDeskVerificationTable.INSTANCE);
	}

	/**
	 * Caches the tourism desk verification in the entity cache if it is enabled.
	 *
	 * @param tourismDeskVerification the tourism desk verification
	 */
	@Override
	public void cacheResult(TourismDeskVerification tourismDeskVerification) {
		entityCache.putResult(
			TourismDeskVerificationImpl.class,
			tourismDeskVerification.getPrimaryKey(), tourismDeskVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism desk verifications in the entity cache if it is enabled.
	 *
	 * @param tourismDeskVerifications the tourism desk verifications
	 */
	@Override
	public void cacheResult(
		List<TourismDeskVerification> tourismDeskVerifications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismDeskVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismDeskVerification tourismDeskVerification :
				tourismDeskVerifications) {

			if (entityCache.getResult(
					TourismDeskVerificationImpl.class,
					tourismDeskVerification.getPrimaryKey()) == null) {

				cacheResult(tourismDeskVerification);
			}
		}
	}

	/**
	 * Clears the cache for all tourism desk verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismDeskVerificationImpl.class);

		finderCache.clearCache(TourismDeskVerificationImpl.class);
	}

	/**
	 * Clears the cache for the tourism desk verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TourismDeskVerification tourismDeskVerification) {
		entityCache.removeResult(
			TourismDeskVerificationImpl.class, tourismDeskVerification);
	}

	@Override
	public void clearCache(
		List<TourismDeskVerification> tourismDeskVerifications) {

		for (TourismDeskVerification tourismDeskVerification :
				tourismDeskVerifications) {

			entityCache.removeResult(
				TourismDeskVerificationImpl.class, tourismDeskVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismDeskVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismDeskVerificationImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new tourism desk verification with the primary key. Does not add the tourism desk verification to the database.
	 *
	 * @param tourismDeskVeriId the primary key for the new tourism desk verification
	 * @return the new tourism desk verification
	 */
	@Override
	public TourismDeskVerification create(long tourismDeskVeriId) {
		TourismDeskVerification tourismDeskVerification =
			new TourismDeskVerificationImpl();

		tourismDeskVerification.setNew(true);
		tourismDeskVerification.setPrimaryKey(tourismDeskVeriId);

		tourismDeskVerification.setCompanyId(CompanyThreadLocal.getCompanyId());

		return tourismDeskVerification;
	}

	/**
	 * Removes the tourism desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismDeskVeriId the primary key of the tourism desk verification
	 * @return the tourism desk verification that was removed
	 * @throws NoSuchTourismDeskVerificationException if a tourism desk verification with the primary key could not be found
	 */
	@Override
	public TourismDeskVerification remove(long tourismDeskVeriId)
		throws NoSuchTourismDeskVerificationException {

		return remove((Serializable)tourismDeskVeriId);
	}

	/**
	 * Removes the tourism desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism desk verification
	 * @return the tourism desk verification that was removed
	 * @throws NoSuchTourismDeskVerificationException if a tourism desk verification with the primary key could not be found
	 */
	@Override
	public TourismDeskVerification remove(Serializable primaryKey)
		throws NoSuchTourismDeskVerificationException {

		Session session = null;

		try {
			session = openSession();

			TourismDeskVerification tourismDeskVerification =
				(TourismDeskVerification)session.get(
					TourismDeskVerificationImpl.class, primaryKey);

			if (tourismDeskVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismDeskVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismDeskVerification);
		}
		catch (NoSuchTourismDeskVerificationException noSuchEntityException) {
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
	protected TourismDeskVerification removeImpl(
		TourismDeskVerification tourismDeskVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismDeskVerification)) {
				tourismDeskVerification = (TourismDeskVerification)session.get(
					TourismDeskVerificationImpl.class,
					tourismDeskVerification.getPrimaryKeyObj());
			}

			if (tourismDeskVerification != null) {
				session.delete(tourismDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismDeskVerification != null) {
			clearCache(tourismDeskVerification);
		}

		return tourismDeskVerification;
	}

	@Override
	public TourismDeskVerification updateImpl(
		TourismDeskVerification tourismDeskVerification) {

		boolean isNew = tourismDeskVerification.isNew();

		if (!(tourismDeskVerification instanceof
				TourismDeskVerificationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismDeskVerification.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismDeskVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismDeskVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismDeskVerification implementation " +
					tourismDeskVerification.getClass());
		}

		TourismDeskVerificationModelImpl tourismDeskVerificationModelImpl =
			(TourismDeskVerificationModelImpl)tourismDeskVerification;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismDeskVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismDeskVerification.setCreateDate(date);
			}
			else {
				tourismDeskVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismDeskVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismDeskVerification.setModifiedDate(date);
			}
			else {
				tourismDeskVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismDeskVerification);
			}
			else {
				tourismDeskVerification =
					(TourismDeskVerification)session.merge(
						tourismDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismDeskVerificationImpl.class, tourismDeskVerificationModelImpl,
			false, true);

		if (isNew) {
			tourismDeskVerification.setNew(false);
		}

		tourismDeskVerification.resetOriginalValues();

		return tourismDeskVerification;
	}

	/**
	 * Returns the tourism desk verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism desk verification
	 * @return the tourism desk verification
	 * @throws NoSuchTourismDeskVerificationException if a tourism desk verification with the primary key could not be found
	 */
	@Override
	public TourismDeskVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismDeskVerificationException {

		TourismDeskVerification tourismDeskVerification = fetchByPrimaryKey(
			primaryKey);

		if (tourismDeskVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismDeskVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismDeskVerification;
	}

	/**
	 * Returns the tourism desk verification with the primary key or throws a <code>NoSuchTourismDeskVerificationException</code> if it could not be found.
	 *
	 * @param tourismDeskVeriId the primary key of the tourism desk verification
	 * @return the tourism desk verification
	 * @throws NoSuchTourismDeskVerificationException if a tourism desk verification with the primary key could not be found
	 */
	@Override
	public TourismDeskVerification findByPrimaryKey(long tourismDeskVeriId)
		throws NoSuchTourismDeskVerificationException {

		return findByPrimaryKey((Serializable)tourismDeskVeriId);
	}

	/**
	 * Returns the tourism desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismDeskVeriId the primary key of the tourism desk verification
	 * @return the tourism desk verification, or <code>null</code> if a tourism desk verification with the primary key could not be found
	 */
	@Override
	public TourismDeskVerification fetchByPrimaryKey(long tourismDeskVeriId) {
		return fetchByPrimaryKey((Serializable)tourismDeskVeriId);
	}

	/**
	 * Returns all the tourism desk verifications.
	 *
	 * @return the tourism desk verifications
	 */
	@Override
	public List<TourismDeskVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @return the range of tourism desk verifications
	 */
	@Override
	public List<TourismDeskVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism desk verifications
	 */
	@Override
	public List<TourismDeskVerification> findAll(
		int start, int end,
		OrderByComparator<TourismDeskVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism desk verifications
	 */
	@Override
	public List<TourismDeskVerification> findAll(
		int start, int end,
		OrderByComparator<TourismDeskVerification> orderByComparator,
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

		List<TourismDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<TourismDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMDESKVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMDESKVERIFICATION;

				sql = sql.concat(
					TourismDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismDeskVerification>)QueryUtil.list(
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
	 * Removes all the tourism desk verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismDeskVerification tourismDeskVerification : findAll()) {
			remove(tourismDeskVerification);
		}
	}

	/**
	 * Returns the number of tourism desk verifications.
	 *
	 * @return the number of tourism desk verifications
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
					_SQL_COUNT_TOURISMDESKVERIFICATION);

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
		return "tourismDeskVeriId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMDESKVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismDeskVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism desk verification persistence.
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

		_finderPathWithPaginationFindBygetTourismDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetTourismDV_ById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"tourismApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetTourismDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetTourismDV_ById", new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, true);

		_finderPathCountBygetTourismDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetTourismDV_ById", new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, false);

		TourismDeskVerificationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismDeskVerificationUtil.setPersistence(null);

		entityCache.removeCache(TourismDeskVerificationImpl.class.getName());
	}

	@Override
	@Reference(
		target = TOURISM_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = TOURISM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = TOURISM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_TOURISMDESKVERIFICATION =
		"SELECT tourismDeskVerification FROM TourismDeskVerification tourismDeskVerification";

	private static final String _SQL_SELECT_TOURISMDESKVERIFICATION_WHERE =
		"SELECT tourismDeskVerification FROM TourismDeskVerification tourismDeskVerification WHERE ";

	private static final String _SQL_COUNT_TOURISMDESKVERIFICATION =
		"SELECT COUNT(tourismDeskVerification) FROM TourismDeskVerification tourismDeskVerification";

	private static final String _SQL_COUNT_TOURISMDESKVERIFICATION_WHERE =
		"SELECT COUNT(tourismDeskVerification) FROM TourismDeskVerification tourismDeskVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismDeskVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismDeskVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismDeskVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismDeskVerificationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}