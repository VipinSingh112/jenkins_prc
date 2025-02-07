/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence.impl;

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
import com.liferay.portal.kernel.util.SetUtil;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismAnnualEntertainBoxException;
import com.nbp.tourism.application.form.services.model.TourismAnnualEntertainBox;
import com.nbp.tourism.application.form.services.model.TourismAnnualEntertainBoxTable;
import com.nbp.tourism.application.form.services.model.impl.TourismAnnualEntertainBoxImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismAnnualEntertainBoxModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismAnnualEntertainBoxPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismAnnualEntertainBoxUtil;
import com.nbp.tourism.application.form.services.service.persistence.impl.constants.TOURISMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the tourism annual entertain box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismAnnualEntertainBoxPersistence.class)
public class TourismAnnualEntertainBoxPersistenceImpl
	extends BasePersistenceImpl<TourismAnnualEntertainBox>
	implements TourismAnnualEntertainBoxPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismAnnualEntertainBoxUtil</code> to access the tourism annual entertain box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismAnnualEntertainBoxImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetTAP_TAI;
	private FinderPath _finderPathWithoutPaginationFindBygetTAP_TAI;
	private FinderPath _finderPathCountBygetTAP_TAI;

	/**
	 * Returns all the tourism annual entertain boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism annual entertain boxes
	 */
	@Override
	public List<TourismAnnualEntertainBox> findBygetTAP_TAI(
		long tourismApplicationId) {

		return findBygetTAP_TAI(
			tourismApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism annual entertain boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @return the range of matching tourism annual entertain boxes
	 */
	@Override
	public List<TourismAnnualEntertainBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end) {

		return findBygetTAP_TAI(tourismApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism annual entertain boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism annual entertain boxes
	 */
	@Override
	public List<TourismAnnualEntertainBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismAnnualEntertainBox> orderByComparator) {

		return findBygetTAP_TAI(
			tourismApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism annual entertain boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism annual entertain boxes
	 */
	@Override
	public List<TourismAnnualEntertainBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismAnnualEntertainBox> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetTAP_TAI;
				finderArgs = new Object[] {tourismApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetTAP_TAI;
			finderArgs = new Object[] {
				tourismApplicationId, start, end, orderByComparator
			};
		}

		List<TourismAnnualEntertainBox> list = null;

		if (useFinderCache) {
			list = (List<TourismAnnualEntertainBox>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TourismAnnualEntertainBox tourismAnnualEntertainBox :
						list) {

					if (tourismApplicationId !=
							tourismAnnualEntertainBox.
								getTourismApplicationId()) {

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

			sb.append(_SQL_SELECT_TOURISMANNUALENTERTAINBOX_WHERE);

			sb.append(_FINDER_COLUMN_GETTAP_TAI_TOURISMAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TourismAnnualEntertainBoxModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				list = (List<TourismAnnualEntertainBox>)QueryUtil.list(
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
	 * Returns the first tourism annual entertain box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism annual entertain box
	 * @throws NoSuchTourismAnnualEntertainBoxException if a matching tourism annual entertain box could not be found
	 */
	@Override
	public TourismAnnualEntertainBox findBygetTAP_TAI_First(
			long tourismApplicationId,
			OrderByComparator<TourismAnnualEntertainBox> orderByComparator)
		throws NoSuchTourismAnnualEntertainBoxException {

		TourismAnnualEntertainBox tourismAnnualEntertainBox =
			fetchBygetTAP_TAI_First(tourismApplicationId, orderByComparator);

		if (tourismAnnualEntertainBox != null) {
			return tourismAnnualEntertainBox;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("tourismApplicationId=");
		sb.append(tourismApplicationId);

		sb.append("}");

		throw new NoSuchTourismAnnualEntertainBoxException(sb.toString());
	}

	/**
	 * Returns the first tourism annual entertain box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism annual entertain box, or <code>null</code> if a matching tourism annual entertain box could not be found
	 */
	@Override
	public TourismAnnualEntertainBox fetchBygetTAP_TAI_First(
		long tourismApplicationId,
		OrderByComparator<TourismAnnualEntertainBox> orderByComparator) {

		List<TourismAnnualEntertainBox> list = findBygetTAP_TAI(
			tourismApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tourism annual entertain box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism annual entertain box
	 * @throws NoSuchTourismAnnualEntertainBoxException if a matching tourism annual entertain box could not be found
	 */
	@Override
	public TourismAnnualEntertainBox findBygetTAP_TAI_Last(
			long tourismApplicationId,
			OrderByComparator<TourismAnnualEntertainBox> orderByComparator)
		throws NoSuchTourismAnnualEntertainBoxException {

		TourismAnnualEntertainBox tourismAnnualEntertainBox =
			fetchBygetTAP_TAI_Last(tourismApplicationId, orderByComparator);

		if (tourismAnnualEntertainBox != null) {
			return tourismAnnualEntertainBox;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("tourismApplicationId=");
		sb.append(tourismApplicationId);

		sb.append("}");

		throw new NoSuchTourismAnnualEntertainBoxException(sb.toString());
	}

	/**
	 * Returns the last tourism annual entertain box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism annual entertain box, or <code>null</code> if a matching tourism annual entertain box could not be found
	 */
	@Override
	public TourismAnnualEntertainBox fetchBygetTAP_TAI_Last(
		long tourismApplicationId,
		OrderByComparator<TourismAnnualEntertainBox> orderByComparator) {

		int count = countBygetTAP_TAI(tourismApplicationId);

		if (count == 0) {
			return null;
		}

		List<TourismAnnualEntertainBox> list = findBygetTAP_TAI(
			tourismApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tourism annual entertain boxes before and after the current tourism annual entertain box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismAnnualEntertainBoxId the primary key of the current tourism annual entertain box
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism annual entertain box
	 * @throws NoSuchTourismAnnualEntertainBoxException if a tourism annual entertain box with the primary key could not be found
	 */
	@Override
	public TourismAnnualEntertainBox[] findBygetTAP_TAI_PrevAndNext(
			long tourismAnnualEntertainBoxId, long tourismApplicationId,
			OrderByComparator<TourismAnnualEntertainBox> orderByComparator)
		throws NoSuchTourismAnnualEntertainBoxException {

		TourismAnnualEntertainBox tourismAnnualEntertainBox = findByPrimaryKey(
			tourismAnnualEntertainBoxId);

		Session session = null;

		try {
			session = openSession();

			TourismAnnualEntertainBox[] array =
				new TourismAnnualEntertainBoxImpl[3];

			array[0] = getBygetTAP_TAI_PrevAndNext(
				session, tourismAnnualEntertainBox, tourismApplicationId,
				orderByComparator, true);

			array[1] = tourismAnnualEntertainBox;

			array[2] = getBygetTAP_TAI_PrevAndNext(
				session, tourismAnnualEntertainBox, tourismApplicationId,
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

	protected TourismAnnualEntertainBox getBygetTAP_TAI_PrevAndNext(
		Session session, TourismAnnualEntertainBox tourismAnnualEntertainBox,
		long tourismApplicationId,
		OrderByComparator<TourismAnnualEntertainBox> orderByComparator,
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

		sb.append(_SQL_SELECT_TOURISMANNUALENTERTAINBOX_WHERE);

		sb.append(_FINDER_COLUMN_GETTAP_TAI_TOURISMAPPLICATIONID_2);

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
			sb.append(TourismAnnualEntertainBoxModelImpl.ORDER_BY_JPQL);
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
						tourismAnnualEntertainBox)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TourismAnnualEntertainBox> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tourism annual entertain boxes where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 */
	@Override
	public void removeBygetTAP_TAI(long tourismApplicationId) {
		for (TourismAnnualEntertainBox tourismAnnualEntertainBox :
				findBygetTAP_TAI(
					tourismApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(tourismAnnualEntertainBox);
		}
	}

	/**
	 * Returns the number of tourism annual entertain boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism annual entertain boxes
	 */
	@Override
	public int countBygetTAP_TAI(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTAP_TAI;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMANNUALENTERTAINBOX_WHERE);

			sb.append(_FINDER_COLUMN_GETTAP_TAI_TOURISMAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETTAP_TAI_TOURISMAPPLICATIONID_2 =
			"tourismAnnualEntertainBox.tourismApplicationId = ?";

	public TourismAnnualEntertainBoxPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("foreign", "foreign_");

		setDBColumnNames(dbColumnNames);

		setModelClass(TourismAnnualEntertainBox.class);

		setModelImplClass(TourismAnnualEntertainBoxImpl.class);
		setModelPKClass(long.class);

		setTable(TourismAnnualEntertainBoxTable.INSTANCE);
	}

	/**
	 * Caches the tourism annual entertain box in the entity cache if it is enabled.
	 *
	 * @param tourismAnnualEntertainBox the tourism annual entertain box
	 */
	@Override
	public void cacheResult(
		TourismAnnualEntertainBox tourismAnnualEntertainBox) {

		entityCache.putResult(
			TourismAnnualEntertainBoxImpl.class,
			tourismAnnualEntertainBox.getPrimaryKey(),
			tourismAnnualEntertainBox);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism annual entertain boxes in the entity cache if it is enabled.
	 *
	 * @param tourismAnnualEntertainBoxes the tourism annual entertain boxes
	 */
	@Override
	public void cacheResult(
		List<TourismAnnualEntertainBox> tourismAnnualEntertainBoxes) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismAnnualEntertainBoxes.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismAnnualEntertainBox tourismAnnualEntertainBox :
				tourismAnnualEntertainBoxes) {

			if (entityCache.getResult(
					TourismAnnualEntertainBoxImpl.class,
					tourismAnnualEntertainBox.getPrimaryKey()) == null) {

				cacheResult(tourismAnnualEntertainBox);
			}
		}
	}

	/**
	 * Clears the cache for all tourism annual entertain boxes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismAnnualEntertainBoxImpl.class);

		finderCache.clearCache(TourismAnnualEntertainBoxImpl.class);
	}

	/**
	 * Clears the cache for the tourism annual entertain box.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismAnnualEntertainBox tourismAnnualEntertainBox) {

		entityCache.removeResult(
			TourismAnnualEntertainBoxImpl.class, tourismAnnualEntertainBox);
	}

	@Override
	public void clearCache(
		List<TourismAnnualEntertainBox> tourismAnnualEntertainBoxes) {

		for (TourismAnnualEntertainBox tourismAnnualEntertainBox :
				tourismAnnualEntertainBoxes) {

			entityCache.removeResult(
				TourismAnnualEntertainBoxImpl.class, tourismAnnualEntertainBox);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismAnnualEntertainBoxImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismAnnualEntertainBoxImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new tourism annual entertain box with the primary key. Does not add the tourism annual entertain box to the database.
	 *
	 * @param tourismAnnualEntertainBoxId the primary key for the new tourism annual entertain box
	 * @return the new tourism annual entertain box
	 */
	@Override
	public TourismAnnualEntertainBox create(long tourismAnnualEntertainBoxId) {
		TourismAnnualEntertainBox tourismAnnualEntertainBox =
			new TourismAnnualEntertainBoxImpl();

		tourismAnnualEntertainBox.setNew(true);
		tourismAnnualEntertainBox.setPrimaryKey(tourismAnnualEntertainBoxId);

		tourismAnnualEntertainBox.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismAnnualEntertainBox;
	}

	/**
	 * Removes the tourism annual entertain box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismAnnualEntertainBoxId the primary key of the tourism annual entertain box
	 * @return the tourism annual entertain box that was removed
	 * @throws NoSuchTourismAnnualEntertainBoxException if a tourism annual entertain box with the primary key could not be found
	 */
	@Override
	public TourismAnnualEntertainBox remove(long tourismAnnualEntertainBoxId)
		throws NoSuchTourismAnnualEntertainBoxException {

		return remove((Serializable)tourismAnnualEntertainBoxId);
	}

	/**
	 * Removes the tourism annual entertain box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism annual entertain box
	 * @return the tourism annual entertain box that was removed
	 * @throws NoSuchTourismAnnualEntertainBoxException if a tourism annual entertain box with the primary key could not be found
	 */
	@Override
	public TourismAnnualEntertainBox remove(Serializable primaryKey)
		throws NoSuchTourismAnnualEntertainBoxException {

		Session session = null;

		try {
			session = openSession();

			TourismAnnualEntertainBox tourismAnnualEntertainBox =
				(TourismAnnualEntertainBox)session.get(
					TourismAnnualEntertainBoxImpl.class, primaryKey);

			if (tourismAnnualEntertainBox == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismAnnualEntertainBoxException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismAnnualEntertainBox);
		}
		catch (NoSuchTourismAnnualEntertainBoxException noSuchEntityException) {
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
	protected TourismAnnualEntertainBox removeImpl(
		TourismAnnualEntertainBox tourismAnnualEntertainBox) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismAnnualEntertainBox)) {
				tourismAnnualEntertainBox =
					(TourismAnnualEntertainBox)session.get(
						TourismAnnualEntertainBoxImpl.class,
						tourismAnnualEntertainBox.getPrimaryKeyObj());
			}

			if (tourismAnnualEntertainBox != null) {
				session.delete(tourismAnnualEntertainBox);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismAnnualEntertainBox != null) {
			clearCache(tourismAnnualEntertainBox);
		}

		return tourismAnnualEntertainBox;
	}

	@Override
	public TourismAnnualEntertainBox updateImpl(
		TourismAnnualEntertainBox tourismAnnualEntertainBox) {

		boolean isNew = tourismAnnualEntertainBox.isNew();

		if (!(tourismAnnualEntertainBox instanceof
				TourismAnnualEntertainBoxModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismAnnualEntertainBox.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismAnnualEntertainBox);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismAnnualEntertainBox proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismAnnualEntertainBox implementation " +
					tourismAnnualEntertainBox.getClass());
		}

		TourismAnnualEntertainBoxModelImpl tourismAnnualEntertainBoxModelImpl =
			(TourismAnnualEntertainBoxModelImpl)tourismAnnualEntertainBox;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismAnnualEntertainBox.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismAnnualEntertainBox.setCreateDate(date);
			}
			else {
				tourismAnnualEntertainBox.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismAnnualEntertainBoxModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismAnnualEntertainBox.setModifiedDate(date);
			}
			else {
				tourismAnnualEntertainBox.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismAnnualEntertainBox);
			}
			else {
				tourismAnnualEntertainBox =
					(TourismAnnualEntertainBox)session.merge(
						tourismAnnualEntertainBox);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismAnnualEntertainBoxImpl.class,
			tourismAnnualEntertainBoxModelImpl, false, true);

		if (isNew) {
			tourismAnnualEntertainBox.setNew(false);
		}

		tourismAnnualEntertainBox.resetOriginalValues();

		return tourismAnnualEntertainBox;
	}

	/**
	 * Returns the tourism annual entertain box with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism annual entertain box
	 * @return the tourism annual entertain box
	 * @throws NoSuchTourismAnnualEntertainBoxException if a tourism annual entertain box with the primary key could not be found
	 */
	@Override
	public TourismAnnualEntertainBox findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismAnnualEntertainBoxException {

		TourismAnnualEntertainBox tourismAnnualEntertainBox = fetchByPrimaryKey(
			primaryKey);

		if (tourismAnnualEntertainBox == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismAnnualEntertainBoxException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismAnnualEntertainBox;
	}

	/**
	 * Returns the tourism annual entertain box with the primary key or throws a <code>NoSuchTourismAnnualEntertainBoxException</code> if it could not be found.
	 *
	 * @param tourismAnnualEntertainBoxId the primary key of the tourism annual entertain box
	 * @return the tourism annual entertain box
	 * @throws NoSuchTourismAnnualEntertainBoxException if a tourism annual entertain box with the primary key could not be found
	 */
	@Override
	public TourismAnnualEntertainBox findByPrimaryKey(
			long tourismAnnualEntertainBoxId)
		throws NoSuchTourismAnnualEntertainBoxException {

		return findByPrimaryKey((Serializable)tourismAnnualEntertainBoxId);
	}

	/**
	 * Returns the tourism annual entertain box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismAnnualEntertainBoxId the primary key of the tourism annual entertain box
	 * @return the tourism annual entertain box, or <code>null</code> if a tourism annual entertain box with the primary key could not be found
	 */
	@Override
	public TourismAnnualEntertainBox fetchByPrimaryKey(
		long tourismAnnualEntertainBoxId) {

		return fetchByPrimaryKey((Serializable)tourismAnnualEntertainBoxId);
	}

	/**
	 * Returns all the tourism annual entertain boxes.
	 *
	 * @return the tourism annual entertain boxes
	 */
	@Override
	public List<TourismAnnualEntertainBox> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism annual entertain boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @return the range of tourism annual entertain boxes
	 */
	@Override
	public List<TourismAnnualEntertainBox> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism annual entertain boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism annual entertain boxes
	 */
	@Override
	public List<TourismAnnualEntertainBox> findAll(
		int start, int end,
		OrderByComparator<TourismAnnualEntertainBox> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism annual entertain boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism annual entertain boxes
	 */
	@Override
	public List<TourismAnnualEntertainBox> findAll(
		int start, int end,
		OrderByComparator<TourismAnnualEntertainBox> orderByComparator,
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

		List<TourismAnnualEntertainBox> list = null;

		if (useFinderCache) {
			list = (List<TourismAnnualEntertainBox>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMANNUALENTERTAINBOX);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMANNUALENTERTAINBOX;

				sql = sql.concat(
					TourismAnnualEntertainBoxModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismAnnualEntertainBox>)QueryUtil.list(
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
	 * Removes all the tourism annual entertain boxes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismAnnualEntertainBox tourismAnnualEntertainBox : findAll()) {
			remove(tourismAnnualEntertainBox);
		}
	}

	/**
	 * Returns the number of tourism annual entertain boxes.
	 *
	 * @return the number of tourism annual entertain boxes
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
					_SQL_COUNT_TOURISMANNUALENTERTAINBOX);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "tourismAnnualEntertainBoxId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMANNUALENTERTAINBOX;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismAnnualEntertainBoxModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism annual entertain box persistence.
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

		_finderPathWithPaginationFindBygetTAP_TAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetTAP_TAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"tourismApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetTAP_TAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetTAP_TAI",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, true);

		_finderPathCountBygetTAP_TAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetTAP_TAI",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, false);

		TourismAnnualEntertainBoxUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismAnnualEntertainBoxUtil.setPersistence(null);

		entityCache.removeCache(TourismAnnualEntertainBoxImpl.class.getName());
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_TOURISMANNUALENTERTAINBOX =
		"SELECT tourismAnnualEntertainBox FROM TourismAnnualEntertainBox tourismAnnualEntertainBox";

	private static final String _SQL_SELECT_TOURISMANNUALENTERTAINBOX_WHERE =
		"SELECT tourismAnnualEntertainBox FROM TourismAnnualEntertainBox tourismAnnualEntertainBox WHERE ";

	private static final String _SQL_COUNT_TOURISMANNUALENTERTAINBOX =
		"SELECT COUNT(tourismAnnualEntertainBox) FROM TourismAnnualEntertainBox tourismAnnualEntertainBox";

	private static final String _SQL_COUNT_TOURISMANNUALENTERTAINBOX_WHERE =
		"SELECT COUNT(tourismAnnualEntertainBox) FROM TourismAnnualEntertainBox tourismAnnualEntertainBox WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismAnnualEntertainBox.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismAnnualEntertainBox exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismAnnualEntertainBox exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismAnnualEntertainBoxPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"foreign"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}